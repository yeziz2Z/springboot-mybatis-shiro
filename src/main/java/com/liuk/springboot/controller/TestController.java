package com.liuk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kl on 2018/6/10.
 */
@Controller
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "html/pages_login";
    }
}
