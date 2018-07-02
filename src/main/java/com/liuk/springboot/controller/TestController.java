package com.liuk.springboot.controller;

import com.liuk.springboot.common.SpringContextHolder;
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

    @RequestMapping({"/login","/"})
    public String hello(HttpServletRequest request){
        Object shiroFilter = SpringContextHolder.getBean("shiroFilter");
        System.out.println(request.getRequestURI());
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        Object shiroLoginFailure = request.getAttribute("shiroLoginFailure");
        System.out.println(shiroLoginFailure);
        System.out.println(shiroFilter +"------------");
        if(principal != null){
            return "redirect:/index";
        }
        return "html/pages_login";
    }

    @RequestMapping("index")
    public String toIndex(){
        return "html/dashboard";
    }

    @RequestMapping("calendar")
    public String toCalendar(){
        System.out.println(5/0);
        return "html/pages_calendar";
    }
}
