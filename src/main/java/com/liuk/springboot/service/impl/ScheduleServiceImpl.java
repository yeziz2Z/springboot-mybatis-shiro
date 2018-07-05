package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Schedule;
import com.liuk.springboot.mapper.ScheduleMapper;
import com.liuk.springboot.service.IScheduleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements IScheduleService {

}
