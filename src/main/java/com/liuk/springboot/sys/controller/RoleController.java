package com.liuk.springboot.sys.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.sys.entity.Role;
import com.liuk.springboot.sys.service.IRoleService;
import com.liuk.springboot.sys.vo.RoleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

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

}

