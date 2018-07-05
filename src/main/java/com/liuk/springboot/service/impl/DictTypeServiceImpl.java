package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.DictType;
import com.liuk.springboot.mapper.DictTypeMapper;
import com.liuk.springboot.service.IDictTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典类型 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class DictTypeServiceImpl extends ServiceImpl<DictTypeMapper, DictType> implements IDictTypeService {

}
