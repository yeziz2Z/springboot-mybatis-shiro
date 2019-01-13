package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.common.EncryptUtil;
import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.mapper.RoleMapper;
import com.liuk.springboot.sys.mapper.UserMapper;
import com.liuk.springboot.sys.service.IUserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.StringUtils.*;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public User getByLoginName(String loginName) {
        
        return baseMapper.selectOne(new User().setLoginName(loginName));
    }

    @Override
    public User getById(String id) {
        User user = baseMapper.getById(id);
        user.setRoleIds(baseMapper.getRoleIdByUserId(id));
        return user;
    }

    @Override
    public User save(User user){
        if (isNotEmpty(user.getId())){
            if(isNotEmpty(user.getPassword())){
                user.setPassword(encodePwd(user.getPassword()));
            }
        }else {
            user.setPassword(encodePwd(user.getPassword()));
        }
        return user;
    }

    /**
     * 密码加密
     * @param password
     * @return
     */
    private String encodePwd(String password){
        byte[] salt = EncryptUtil.generateSalt(16);
        SimpleHash simpleHash = new SimpleHash("MD5", password, ByteSource.Util.bytes(salt),1024);
        return simpleHash.toHex();
    }
}
