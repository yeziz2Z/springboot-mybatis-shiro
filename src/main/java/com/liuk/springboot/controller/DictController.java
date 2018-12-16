package com.liuk.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/dict")
public class DictController {

    @RequestMapping("toDictPage")
    public String toDictPage(){
        return "html/sys/dict/pages_dict";
    }
}

