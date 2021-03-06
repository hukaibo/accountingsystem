package com.example.demo.dao;

import com.example.demo.dao.Mapper.UserInfoMapper;
import com.example.demo.model.persistence.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {
    private UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoDAOImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo getUserInfoById(Long id) {
        return userInfoMapper.getUserInfoByUserId(id);
    }

    @Override
    public UserInfo getUserByUsername(String username) {
        return userInfoMapper.getUserByUsername(username);
    }

    @Override
    public void createUser(UserInfo userInfo) {
        userInfoMapper.createUser(userInfo);
    }

    @Override
    public Long getIdByUsername(String username) {
        return userInfoMapper.getUserIdByUsername(username);
    }
}
