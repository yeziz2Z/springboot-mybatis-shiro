package com.liuk.springboot.sys.service.impl;

import com.liuk.springboot.sys.entity.Role;
import com.liuk.springboot.sys.mapper.RoleMapper;
import com.liuk.springboot.sys.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.sys.vo.RoleVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public RoleVO getRoleVOById(String id) {
        return baseMapper.getRoleVOById(id);
    }

    @Override
    @Transactional
    public boolean insertRoleMenu(String roleId, List<String> menuIds) {
        baseMapper.deleteRoleMenu(roleId);
        baseMapper.insertRoleMenu(roleId,menuIds);
        return true;
    }

}
