package com.supmti.productsapi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="Users")
public class User {


    @Id
    private int id;
    private String userName;
    private String password;
    private String role;


    public User() {

    }
}
