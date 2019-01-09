package com.liuk.springboot.sys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/user")
@Slf4j
public class SysUserController extends BaseController {

    @Autowired
    private IUserService userService;


    @RequestMapping("userPage")
    public String toUser(){
        return "html/sys/user/pages_user";
    }

    @RequestMapping("form")
    public String form(){

        return "html/sys/user/userForm";
    }

    @PostMapping("userList")
    @ResponseBody
    public Map<String, Object> queryUserList(@RequestParam("iDisplayStart") Integer start,
                                             @RequestParam("iDisplayLength")Integer length){
        Page<User> page = new Page<>(start / length + 1,length);
        return getDataTableData(userService.selectPage(page) );
    }



    @PostMapping("add")
    @ResponseBody
    public Object add(){

        return null;
    }

    @PostMapping("deleteAll")
    @ResponseBody
    public String deleteAll(@RequestBody List<String> ids){
        userService.deleteBatchIds(ids);
        return "ok!";
    }

}
