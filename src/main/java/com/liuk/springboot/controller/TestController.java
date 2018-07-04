package com.liuk.springboot.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kl on 2018/6/10.
 * @author liuk
 */
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping({"/login","/"})
    public String hello(HttpServletRequest request, Model model){
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        if(principal != null){
            return "redirect:/index";
        }
        String message = (String) request.getAttribute("message");
        if(StringUtils.isNotBlank(message) && !StringUtils.equals(message,"null")){
            logger.info(message);
            message = "用户名或密码错误,请重试！";
        }
        model.addAttribute("message",message);
        return "html/pages_login";
    }

    @RequestMapping("index")
    public String toIndex(){
        return "html/dashboard";
    }

    @RequestMapping("calendar")
    public String toCalendar(){
        return "html/pages_calendar";
    }
}
