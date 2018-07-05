package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Role;
import com.liuk.springboot.mapper.RoleMapper;
import com.liuk.springboot.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
