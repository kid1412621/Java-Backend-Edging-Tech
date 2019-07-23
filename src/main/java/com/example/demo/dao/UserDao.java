package com.example.demo.dao;

import com.example.demo.model.TUser;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
//@RepositoryRestResource(path = "user")
public interface UserDao extends JpaRepository<TUser, Long>, JpaSpecificationExecutor<TUser> {

    Optional<TUser> findByEmail(String email);

    @Query("SELECT u FROM TUser u WHERE LOWER(u.username) = LOWER(:username)")
    Optional<TUser> retrieveByUsername(@Param("username") String username);

    @Transactional
    @Modifying
    @Query("update TUser u set u.gender = :gender where u.username = :username")
    int updateGenderForName(@Param("gender") Integer gender,
                            @Param("username") String username);

    @Transactional
    @Modifying
    @Query(value = "insert into t_user (username, mobile) values (:username, :mobile)",
            nativeQuery = true)// HSQL cannot execute insert operation
    void insertUser(@Param("username") String username, @Param("mobile") String mobile);

//    long count(Specification<TUser> conn);
}
