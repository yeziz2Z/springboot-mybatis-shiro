package com.liuk.springboot.service;

import com.liuk.springboot.entity.User;

public interface IUserService {
    User get(String id);

    User getByLoginName(String loginName);
}
