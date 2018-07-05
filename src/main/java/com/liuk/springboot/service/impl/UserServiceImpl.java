package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.User;
import com.liuk.springboot.mapper.UserMapper;
import com.liuk.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public User getByLoginName(String loginName) {
        return userMapper.selectOne(new User().setLoginName(loginName));
    }
}
