package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Office;
import com.liuk.springboot.mapper.OfficeMapper;
import com.liuk.springboot.service.IOfficeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机构表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class OfficeServiceImpl extends ServiceImpl<OfficeMapper, Office> implements IOfficeService {

}
