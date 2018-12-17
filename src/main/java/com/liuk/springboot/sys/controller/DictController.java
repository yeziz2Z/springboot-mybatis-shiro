package com.liuk.springboot.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 字典类型 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/dict")
public class DictController {

    @RequestMapping("toDictPage")
    public String toUser(){
        return "html/sys/dict/pages_dict";
    }
}

