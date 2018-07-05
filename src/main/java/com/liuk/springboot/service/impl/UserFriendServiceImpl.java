package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.UserFriend;
import com.liuk.springboot.mapper.UserFriendMapper;
import com.liuk.springboot.service.IUserFriendService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class UserFriendServiceImpl extends ServiceImpl<UserFriendMapper, UserFriend> implements IUserFriendService {

}
