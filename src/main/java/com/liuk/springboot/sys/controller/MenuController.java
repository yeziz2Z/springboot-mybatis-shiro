package com.liuk.springboot.sys.controller;


import com.liuk.springboot.core.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/menu")
public class MenuController extends BaseController {

    @RequestMapping("toMenuPage")
    public String toMenuPage(){
        return "html/sys/menu/pages_menu";
    }
}

