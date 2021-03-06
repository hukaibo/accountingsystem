package com.example.demo.model.common;


import lombok.Builder;
import lombok.Data;


//commont是给manager提供的数据
public class UserInfo {
    private Long id;
    private String username;
    private String password;
    private String Salt;

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

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
