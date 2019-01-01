package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Menu;
import com.liuk.springboot.sys.mapper.MenuMapper;
import com.liuk.springboot.sys.service.IMenuService;
import com.liuk.springboot.sys.vo.MenuVO;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<MenuVO> getMenuVOListByParentId(String parentId) {
        return baseMapper.getMenuVOListByParentId(parentId);
    }

    @Override
    public List<JsTree> getAllMenuTree() {
        return baseMapper.getAllMenuTree();
    }

    @Override
    public MenuVO getMenuVOById(String id) {
        return baseMapper.getMenuVOById(id);
    }
}
