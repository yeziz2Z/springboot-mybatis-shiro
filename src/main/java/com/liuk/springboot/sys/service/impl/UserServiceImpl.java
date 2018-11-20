package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.mapper.UserMapper;
import com.liuk.springboot.sys.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {


    @Override
    public User getByLoginName(String loginName) {
        
        return baseMapper.selectOne(new User().setLoginName(loginName));
    }
}
