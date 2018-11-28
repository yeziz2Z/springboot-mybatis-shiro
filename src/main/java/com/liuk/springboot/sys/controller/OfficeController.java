package com.liuk.springboot.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Office;
import com.liuk.springboot.sys.service.IOfficeService;
import com.liuk.springboot.sys.vo.OfficeVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public String officeForm(String officeId,Model model){
        if (StringUtils.isNotEmpty(officeId)){
            model.addAttribute("office",officeService.getOfficeVoById(officeId));
        }else {
            model.addAttribute("office",new OfficeVO());
        }

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

    @RequestMapping("treeData")
    @ResponseBody
    public List<JsTree> treeData(){
        //TODO 逻辑待优化
        List<JsTree> officeTree = officeService.getAllOfficeTree();
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

