package com.liuk.springboot.sys.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.common.Result;
import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.sys.entity.Role;
import com.liuk.springboot.sys.service.IMenuService;
import com.liuk.springboot.sys.service.IRoleService;
import com.liuk.springboot.sys.vo.RoleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/role")
public class RoleController extends BaseController {

    @Autowired
    IRoleService roleService;
    @Autowired
    IMenuService menuService;

    @RequestMapping("toRolePage")
    public String toRolePage(){
        return "html/sys/role/pages_role";
    }

    @RequestMapping("data")
    @ResponseBody
    public Map<String,Object> data(@RequestParam("iDisplayStart") Integer start,
                    @RequestParam("iDisplayLength")Integer length){
        Page<Role> page = new Page<>(start / length + 1,length);
        return getDataTableData(roleService.selectPage(page));
    }

    @RequestMapping("form")
    public String roleForm(RoleVO roleVO, Model model){
        if(StringUtils.isNotEmpty(roleVO.getId())){
            roleVO = roleService.getRoleVOById(roleVO.getId());
        }
        model.addAttribute("role",roleVO);
        return "html/sys/role/roleForm";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestBody List<String> ids){
//        roleService.deleteBatchIds(ids);
        System.out.println(ids);
        return "ok";
    }

    @RequestMapping("save")
    @ResponseBody
    public Result<Role> save(Role role){
        Result<Role> result = new Result<>();
        roleService.insertOrUpdate(role.setDelFlag("0")
                .setCreateBy("admin")
                .setUpdateBy("admin")
                .setCreateDate(new Date())
                .setUpdateDate(new Date()));
        result.setData(role);
        return result;
    }

    @RequestMapping("roleAuthTree")
    @ResponseBody
    public List<JsTree> roleAuthTree(String roleId){
        //TODO 逻辑待优化
        List<JsTree> roleAuth = menuService.getMenuAuth(roleId);
        Map<String, List<JsTree>> collect = roleAuth.stream().collect(Collectors.groupingBy(JsTree::getParentId));
        roleAuth.forEach(jsTree -> {
            if (collect.containsKey(jsTree.getKey())){
                jsTree.setChildren(collect.get(jsTree.getKey()));
            }
        });
        roleAuth = roleAuth.stream().filter(jsTree -> jsTree.getParentId().equals("0")).collect(Collectors.toList());
        return roleAuth;
    }

    @RequestMapping("auth")
    @ResponseBody
    public Object auth(String roleId,String menuIds){
        roleService.insertRoleMenu(roleId, Arrays.asList(menuIds.split(",")));
        return "ok";
    }
}

