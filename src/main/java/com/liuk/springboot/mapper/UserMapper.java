package com.liuk.springboot.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
