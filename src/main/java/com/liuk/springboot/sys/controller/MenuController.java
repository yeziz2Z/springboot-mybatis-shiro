package com.liuk.springboot.sys.controller;

import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.common.Result;
import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.sys.entity.Menu;
import com.liuk.springboot.sys.service.IMenuService;
import com.liuk.springboot.sys.vo.MenuVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    IMenuService menuService;

    @RequestMapping("toMenuPage")
    public String toMenuPage(){
        return "html/sys/menu/pages_menu";
    }

    @RequestMapping("save")
    @ResponseBody
    public Result<Menu> save(Menu menu){
        Result<Menu> result = new Result<>();
        menuService.insertOrUpdate(menu.setDelFlag("0")
                .setParentIds(menu.getParentId())
                .setSort(100).setUpdateDate(new Date())
                .setCreateDate(new Date())
                .setCreateBy("admin")
                .setUpdateBy("admin"));
        result.setData(menu);
        return result;
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(String id){
        menuService.deleteById(id);
        return "ok!";
    }

    @RequestMapping("getChildren")
    @ResponseBody
    public List<MenuVO> getChildren(String parentId){
        if ("-1".equals(parentId)) {
            parentId = "1";
        }
        return menuService.getMenuVOListByParentId(parentId);
    }

    @RequestMapping("form")
    public String menuForm(MenuVO menuVO, Model model){
        if(StringUtils.isNotEmpty(menuVO.getId())){
            menuVO = menuService.getMenuVOById(menuVO.getId());
        }else if (StringUtils.isNotEmpty(menuVO.getParentId())){
            menuVO.setParentName(menuService.selectById(menuVO.getParentId()).getName());
        }
        model.addAttribute("menu",menuVO);
        return "html/sys/menu/menuForm";
    }

    @RequestMapping("icons")
    public String icon(){
        return "html/common/icons";
    }


    @RequestMapping("treeData")
    @ResponseBody
    public List<JsTree> treeData(){
        //TODO 逻辑待优化
        List<JsTree> officeTree = menuService.getAllMenuTree();
        Map<String, List<JsTree>> collect = officeTree.stream().collect(Collectors.groupingBy(JsTree::getParentId));
        officeTree.forEach(jsTree -> {
            if (collect.containsKey(jsTree.getKey())){
                jsTree.setChildren(collect.get(jsTree.getKey()));
            }
        });
        officeTree = officeTree.stream().filter(jsTree -> jsTree.getParentId().equals("0")).collect(Collectors.toList());
        return officeTree;
    }
}

