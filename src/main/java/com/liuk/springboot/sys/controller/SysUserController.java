package com.liuk.springboot.sys.controller;

import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sys")
public class SysUserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IUserService userService;


    @RequestMapping("user")
    public String toUser(){
        return "html/sys/pages_user";
    }

    @GetMapping("userList")
    @ResponseBody
    public Object queryUserList(){
        List<User> users = userService.selectList(null);
        return users;
    }
}
