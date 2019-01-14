package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getById(@Param("id") String id);

    List<String> getRoleIdByUserId(@Param("userId") String userId);

    boolean updateUserBySelect(User user);

    int deleteUserRoleByUserId(@Param("userId") String userId);

    int insertUserRole(@Param("userId") String userId,@Param("roleIds")List<String> roleIds);
}
