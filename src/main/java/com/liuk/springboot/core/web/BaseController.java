package com.liuk.springboot.core.web;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {


    public <T> Map<String,Object> getDataTableData(Page<T> page){
        Map<String,Object> map = new HashMap<>();

        map.put("iTotalRecords",page.getTotal());
        map.put("iTotalDisplayRecords",page.getTotal());
        map.put("data",page.getRecords());

        return map;
    }

}
