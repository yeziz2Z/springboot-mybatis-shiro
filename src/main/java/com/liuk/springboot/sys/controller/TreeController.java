package com.liuk.springboot.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sys")
@Controller
public class TreeController {

    @RequestMapping("treeSelect")
    public String treeSelect(String url,String inputName,String inputId, Model model){
        model.addAttribute("url",url);
        model.addAttribute("inputName",inputName);
        model.addAttribute("inputId",inputId);
        return "html/sys/treeSelect";
    }
}
