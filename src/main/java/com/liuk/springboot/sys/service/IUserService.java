package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.sys.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {

    User getByLoginName(String loginName);

    User getById(String id);

    User save(User user);

    boolean deleteUserBatch(List<String> ids);
}
