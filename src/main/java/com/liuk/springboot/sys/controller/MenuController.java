package com.liuk.springboot.sys.controller;

import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.sys.service.IMenuService;
import com.liuk.springboot.sys.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Autowired
    IMenuService iMenuService;

    @RequestMapping("toMenuPage")
    public String toMenuPage(){
        return "html/sys/menu/pages_menu";
    }

    @RequestMapping("getChildren")
    @ResponseBody
    public List<MenuVO> getChildren(String parentId){
        if ("-1".equals(parentId)) {
            parentId = "1";
        }
        return iMenuService.getMenuVOListByParentId(parentId);
    }

    @RequestMapping("form")
    public String menuForm(){
        return "html/sys/menu/menuForm";
    }

    @RequestMapping("icons")
    public String icon(){
        return "html/common/icons";
    }
}

