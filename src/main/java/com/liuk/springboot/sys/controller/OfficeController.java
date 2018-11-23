package com.liuk.springboot.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.liuk.springboot.sys.entity.Office;
import com.liuk.springboot.sys.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 机构表 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("sys/office")
public class OfficeController {

    @Autowired
    IOfficeService officeService;

    @RequestMapping("toOfficePage")
    public String toUser(){
        return "html/sys/pages_office";
    }

    @RequestMapping("form")
    public String officeForm(){
        return "html/sys/officeForm";
    }

    @RequestMapping("getChildren")
    @ResponseBody
    public List<Office> getChildren(String parentId){

        if ("-1".equals(parentId)) {
            parentId = "0";
        }
        Office office = new Office();
        office.setParentId(parentId);
        EntityWrapper wrapper = new EntityWrapper<Office>();
        wrapper.setEntity(office);
        List list = officeService.selectList(wrapper);
        return list;
    }
}

