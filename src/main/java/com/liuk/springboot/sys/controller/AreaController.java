package com.liuk.springboot.sys.controller;


import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Area;
import com.liuk.springboot.sys.service.IAreaService;
import com.liuk.springboot.sys.vo.AreaVO;
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
 * 区域表; InnoDB free: 34816 kB 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/area")
public class AreaController {

    @Autowired
    private IAreaService areaService;

    @RequestMapping("toAreaPage")
    public String toUser(){
        return "html/sys/area/pages_area";
    }

    @RequestMapping("form")
    public String areaForm(String areaId, Model model){
        if (StringUtils.isNotEmpty(areaId)){
            model.addAttribute("area",areaService.getAreaVoById(areaId));
        }else {
            model.addAttribute("area",new AreaVO());
        }
        return "html/sys/area/areaForm";
    }

    @RequestMapping("save")
    @ResponseBody
    public Object save(Area area){
        areaService.insertOrUpdate(area);
        return "ok!";
    }

    @RequestMapping("getChildren")
    @ResponseBody
    public List<AreaVO> getChildren(String parentId){
        if ("-1".equals(parentId)){
            parentId = "0";
        }
        return areaService.getAreaVOList(parentId);
    }

    @RequestMapping("treeData")
    @ResponseBody
    public List<JsTree> treeData(){
        //TODO 逻辑待优化
        List<JsTree> areaTree = areaService.getAllAreaTree();
        Map<String, List<JsTree>> collect = areaTree.stream().collect(Collectors.groupingBy(JsTree::getParentId));
        areaTree.forEach(jsTree -> {
            if (collect.containsKey(jsTree.getKey())){
                jsTree.setChildren(collect.get(jsTree.getKey()));
            }
        });
        areaTree = areaTree.stream().filter(jsTree -> jsTree.getParentId().equals("0")).collect(Collectors.toList());
        return areaTree;
    }
}

