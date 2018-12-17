package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.sys.entity.DictValue;

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

    String getDictLabel(String type, String value);
}
