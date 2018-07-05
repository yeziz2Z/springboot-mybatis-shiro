package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.UserRole;
import com.liuk.springboot.mapper.UserRoleMapper;
import com.liuk.springboot.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
