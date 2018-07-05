package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.DictValue;
import com.liuk.springboot.mapper.DictValueMapper;
import com.liuk.springboot.service.IDictValueService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典值 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class DictValueServiceImpl extends ServiceImpl<DictValueMapper, DictValue> implements IDictValueService {

}
