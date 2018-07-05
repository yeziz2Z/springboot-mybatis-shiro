package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.RoleMenu;
import com.liuk.springboot.mapper.RoleMenuMapper;
import com.liuk.springboot.service.IRoleMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色-菜单 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

}
