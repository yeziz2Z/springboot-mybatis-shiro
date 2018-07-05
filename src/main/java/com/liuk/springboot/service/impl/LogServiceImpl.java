package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Log;
import com.liuk.springboot.mapper.LogMapper;
import com.liuk.springboot.service.ILogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
