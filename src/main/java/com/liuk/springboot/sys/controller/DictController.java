package com.liuk.springboot.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.liuk.springboot.common.Result;
import com.liuk.springboot.core.web.BaseController;
import com.liuk.springboot.entity.Dict;
import com.liuk.springboot.sys.entity.Area;
import com.liuk.springboot.sys.entity.DictType;
import com.liuk.springboot.sys.entity.DictValue;
import com.liuk.springboot.sys.service.IDictTypeService;
import com.liuk.springboot.sys.service.IDictValueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典类型 前端控制器
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Controller
@RequestMapping("/sys/dict")
public class DictController extends BaseController {

    @Autowired
    IDictTypeService dictTypeService;
    @Autowired
    IDictValueService dictValueService;

    @RequestMapping("toDictPage")
    public String toUser(){
        return "html/sys/dict/pages_dict";
    }


    @RequestMapping("data")
    @ResponseBody
    public Map<String, Object> data(@RequestParam("iDisplayStart") Integer start,
                                    @RequestParam("iDisplayLength")Integer length){
        Page<DictType> page = new Page<>(start / length + 1,length);
        return getDataTableData(dictTypeService.selectPage(page));
    }

    @PostMapping("/deleteDict")
    @ResponseBody
    public String deleteAll(@RequestBody List<String> ids){
        dictTypeService.deleteBatchIds(ids);
        DictValue dictValue;
        for(String id:ids){
            dictValue = new DictValue().setDictTypeId(id);
            EntityWrapper<DictValue> entityWrapper = new EntityWrapper<>(dictValue);
            dictValueService.delete(entityWrapper);
        }
        return "ok!";
    }

    @RequestMapping("dictValue")
    @ResponseBody
    public Map<String,Object> dictValue(String dictTypeId){
        Map<String,Object> result = new HashMap<>();
        EntityWrapper<DictValue> entityWrapper = new EntityWrapper<>(new DictValue().setDictTypeId(dictTypeId));
        entityWrapper.orderBy("sort");
        List<DictValue> dictValues = dictValueService.selectList(entityWrapper);
        result.put("data",dictValues);
        return result;
    }

    @RequestMapping("deleteDictValue")
    @ResponseBody
    public String deleteDictValue(String dictValueId){
        dictValueService.deleteById(dictValueId);
        return "ok!";
    }

    @RequestMapping("form")
    public String dictForm(){
        return "html/sys/dict/dictForm";
    }

    @RequestMapping("dictTypeForm")
    public String dictTypeForm(String id, Model model){
        DictType dictType = new DictType();
        if (StringUtils.isNotEmpty(id)){
            dictType = dictTypeService.selectById(id);
        }
        model.addAttribute("dictType",dictType);
        return "html/sys/dict/dictTypeForm";
    }
    @RequestMapping("dictValueForm")
    public String dictValueForm(String id,String dictTypeId, Model model){
        DictValue dictValue = new DictValue();
        if (StringUtils.isNotEmpty(id)){
            dictValue = dictValueService.selectById(id);
        }else {
            dictValue.setDictTypeId(dictTypeId);
        }
        model.addAttribute("dictValue",dictValue);
        return "html/sys/dict/dictValueForm";
    }

    @RequestMapping("saveDictType")
    @ResponseBody
    public Result<DictType> saveDictType(DictType dictType){
        Result<DictType> result = new Result<>();
        dictTypeService.insertOrUpdate(dictType);
        return result;
    }

    @RequestMapping("saveDictValue")
    @ResponseBody
    public Result<DictType> saveDictValue(DictValue dictValue){
        Result<DictType> result = new Result<>();
        dictValueService.insertOrUpdate(dictValue);
        return result;
    }
}

