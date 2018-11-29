package com.liuk.springboot.service;

import com.liuk.springboot.entity.DictValue;
import com.baomidou.mybatisplus.service.IService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 字典值 服务类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface IDictValueService extends IService<DictValue> {


    List<DictValue> getDictList(String type);

    String getDictLabel(String type,String value);
}
