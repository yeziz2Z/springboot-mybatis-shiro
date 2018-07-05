package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Config;
import com.liuk.springboot.mapper.ConfigMapper;
import com.liuk.springboot.service.IConfigService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
