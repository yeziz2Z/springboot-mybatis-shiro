package com.liuk.springboot.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kl on 2018/6/10.
 */
@Controller
public class TestController {

    @RequestMapping("login")
    public String hello(HttpServletRequest request){

        System.out.println(request.getRequestURI());
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        if(principal != null){
            return "redirect:/loginSuccess";
        }
        return "html/pages_login";
    }

    @RequestMapping("loginSuccess")
    public String toIndex(){
        return "html/dashboard";
    }
}
