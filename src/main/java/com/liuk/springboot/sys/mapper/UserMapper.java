package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.sys.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
