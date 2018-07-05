package com.liuk.springboot.service.impl;

import com.liuk.springboot.entity.Menu;
import com.liuk.springboot.mapper.MenuMapper;
import com.liuk.springboot.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
