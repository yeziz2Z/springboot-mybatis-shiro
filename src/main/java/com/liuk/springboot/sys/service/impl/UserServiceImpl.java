package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.common.EncryptUtil;
import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.mapper.UserMapper;
import com.liuk.springboot.sys.service.IUserService;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

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
    @Transactional
    public User save(User user){
        if (isNotEmpty(user.getId())){
            if(isNotEmpty(user.getPassword())){
                user.setPassword(encodePwd(user.getPassword()));
            }
            baseMapper.updateUserBySelect(user);

            baseMapper.deleteUserRoleByUserId(user.getId());
        }else {
            user.setPassword(encodePwd(user.getPassword()));
            baseMapper.insert(user);
        }
        int i = baseMapper.insertUserRole(user.getId(), user.getRoleIds());
        System.out.println(i);
        return user;
    }

    @Override
    @Transactional
    public boolean deleteUserBatch(List<String> ids) {
        baseMapper.deleteBatchIds(ids);
        baseMapper.deleteUserRoleBatch(ids);
        return true;
    }

    /**
     * 密码加密
     * @param password
     * @return
     */
    private String encodePwd(String password){
        System.out.println(password);
        byte[] salt = EncryptUtil.generateSalt(8);
        SimpleHash simpleHash = new SimpleHash("MD5", password, ByteSource.Util.bytes(salt),1024);
        return Hex.encodeToString(salt) + simpleHash.toHex();
    }

    @Override
    public Page<User> selectPage(Page<User> page) {
//        baseMapper.selectPage()
        List<User> users = baseMapper.selectPage(page, null);
        return super.selectPage(page);
    }

}
