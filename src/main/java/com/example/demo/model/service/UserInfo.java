package com.example.demo.model.service;


import lombok.Builder;
import lombok.Data;

//service是给前端展示的UserInfo
public class UserInfo {

    private Long id;
    private String username;
    private String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}