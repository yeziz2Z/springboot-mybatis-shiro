package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Menu;
import com.liuk.springboot.sys.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<MenuVO> getMenuVOListByParentId(@Param("parentId") String parentId);

    List<JsTree> getAllMenuTree();

    MenuVO getMenuVOById(@Param("id") String id);
}
