package com.liuk.springboot.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.entity.User;

public interface IUserService extends IService<User> {

    User getByLoginName(String loginName);
}
