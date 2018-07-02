package com.liuk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误响应页面
 */
@Controller
@RequestMapping("/error")
public class ErrorPageController {

    @RequestMapping("/404")
    public String error404(){
        return "html/pages_404";
    }

    @RequestMapping("/500")
    public String error500(){
        return "html/pages_500";
    }
}
