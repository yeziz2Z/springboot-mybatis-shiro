package com.liuk.springboot.sys.service.impl;

import com.liuk.springboot.sys.entity.DictValue;
import com.liuk.springboot.sys.mapper.DictTypeMapper;
import com.liuk.springboot.sys.mapper.DictValueMapper;
import com.liuk.springboot.sys.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
public class DictServiceImpl implements IDictService {
    @Autowired
    DictTypeMapper dictTypeMapper;

    @Autowired
    DictValueMapper dictValueMapper;

    @Override
    @Transactional
    public void deleteDictBatch(List<String> ids) {

    }
}
