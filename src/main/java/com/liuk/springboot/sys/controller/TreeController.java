package com.liuk.springboot.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sys")
@Controller
public class TreeController {

    @RequestMapping("treeSelect")
    public String treeSelect(String url,String inputName,String inputId,boolean checkbox, Model model){
        if(checkbox){
            model.addAttribute("url",url + "?roleId=" + inputId);
            model.addAttribute("checkbox",checkbox);
            model.addAttribute("roleId",inputId);
        }else {
            model.addAttribute("inputName",inputName);
            model.addAttribute("inputId",inputId);
            model.addAttribute("url",url);
        }
        return "html/sys/treeSelect";
    }
}
