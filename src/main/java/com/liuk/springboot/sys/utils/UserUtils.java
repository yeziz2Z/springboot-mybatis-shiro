package com.liuk.springboot.sys.utils;

import com.liuk.springboot.common.SpringContextHolder;
import com.liuk.springboot.sys.entity.Menu;
import com.liuk.springboot.sys.entity.Role;
import com.liuk.springboot.sys.entity.User;
import com.liuk.springboot.sys.mapper.MenuMapper;
import com.liuk.springboot.sys.mapper.RoleMapper;
import org.apache.shiro.SecurityUtils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserUtils {

    private static final ConcurrentHashMap<String,List<Menu>> menuCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String,List<Role>> roleCache = new ConcurrentHashMap<>();

    private static MenuMapper menuMapper = SpringContextHolder.getBean(MenuMapper.class);

    private static RoleMapper roleMapper = SpringContextHolder.getBean(RoleMapper.class);


    public static List<Menu> getMenuList(){
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<Menu> menuList = menuCache.get(user.getId());
        if (menuList == null){
            if (user.isAdmin()){
                menuList = menuMapper.selectList(null);
            }else {
                menuList = menuMapper.getMenuListByUserId(user.getId());
            }
            menuCache.put(user.getId(),menuList);
       }
       return menuList;
    }

    public static List<Role> getRoleList(User user){
        List<Role> list = roleCache.get(user.getId());
        if (list == null){
            list = roleMapper.getByUserId(user.getId());
            roleCache.put(user.getId(),list);
        }
        return list;
    }
}
