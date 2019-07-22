package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "t_user", schema = "demo")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer gender;
    private String username;
    private String mobile;
    private String email;
    @CreatedDate
    private Timestamp createTime;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUser that = (TUser) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(username, that.username) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender, username, mobile, email, createTime, updateTime);
    }
}
