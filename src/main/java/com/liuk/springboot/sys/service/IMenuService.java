package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Menu;
import com.liuk.springboot.sys.vo.MenuVO;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface IMenuService extends IService<Menu> {

    List<MenuVO> getMenuVOListByParentId(String parentId);

    List<JsTree> getAllMenuTree();

    MenuVO getMenuVOById(String id);

    List<JsTree> getMenuAuth(String id);
}
