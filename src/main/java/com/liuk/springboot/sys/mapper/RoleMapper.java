package com.liuk.springboot.sys.mapper;

import com.liuk.springboot.sys.entity.Role;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.sys.vo.RoleVO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface RoleMapper extends BaseMapper<Role> {

    RoleVO getRoleVOById(@Param("id") String id);
}
