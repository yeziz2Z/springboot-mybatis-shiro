package com.liuk.springboot.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 机构表 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("sys")
public class OfficeController {

    @RequestMapping("office")
    public String toUser(){
        return "html/sys/pages_office";
    }
}

