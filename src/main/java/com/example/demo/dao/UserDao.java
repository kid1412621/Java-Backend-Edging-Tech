package com.example.demo.dao;

import com.example.demo.model.TUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
//@RepositoryRestResource(path = "user")
public interface UserDao extends JpaRepository<TUser, Long>, JpaSpecificationExecutor<TUser> {
    TUser save(TUser user);

    Optional<TUser> findById(Long id);

    Page<TUser> findAll(Pageable pageable);

    @Query("SELECT u FROM TUser u WHERE LOWER(u.username) = LOWER(:username)")
    TUser retrieveByUsername(@Param("username") String username);

    @Modifying
    @Query("update TUser u set u.gender = :gender where u.username = :username")
    int updateUserSetStatusForName(@Param("gender") Integer gender,
                                   @Param("username") String username);

//    @Modifying
//    @Query(value = "insert into Users (name, age, email, status) values (:name, :age, :email, :status)",
//            nativeQuery = true)
//    void insertUser(@Param("name") String name, @Param("age") Integer age,
//                    @Param("status") Integer status, @Param("email") String email);

    long count(Specification<TUser> conn);
}
