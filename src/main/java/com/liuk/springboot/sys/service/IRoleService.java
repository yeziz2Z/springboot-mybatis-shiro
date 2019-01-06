package com.liuk.springboot.sys.service;

import com.liuk.springboot.sys.entity.Role;
import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.sys.vo.RoleVO;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface IRoleService extends IService<Role> {

    RoleVO getRoleVOById(String id);

    boolean insertRoleMenu(String roleId, List<String> menuIds);

}
