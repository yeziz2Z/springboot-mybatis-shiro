package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.sys.entity.User;

public interface IUserService extends IService<User> {

    User getByLoginName(String loginName);
}
