package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
@Data

@NoArgsConstructor
@Table(name = "tuser")
public class User implements Serializable {
    @Id
    private String username;
    private String password;
    @Transient
    private String statue;

    public User( String username,String password) {
        this.username=username;
        this.password = password;
    }
}