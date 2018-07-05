package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Dict;
import com.liuk.springboot.mapper.DictMapper;
import com.liuk.springboot.service.IDictService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

}
