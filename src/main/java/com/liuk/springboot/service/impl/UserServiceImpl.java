package com.liuk.springboot.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.entity.User;
import com.liuk.springboot.mapper.UserMapper;
import com.liuk.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {


    @Override
    public User getByLoginName(String loginName) {

        return baseMapper.selectOne(new User().setLoginName(loginName));
    }
}
