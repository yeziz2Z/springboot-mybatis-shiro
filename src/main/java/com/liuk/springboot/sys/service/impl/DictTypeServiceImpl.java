package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.sys.entity.DictType;
import com.liuk.springboot.sys.mapper.DictTypeMapper;
import com.liuk.springboot.sys.service.IDictTypeService;
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
