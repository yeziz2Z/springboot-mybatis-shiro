package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Area;
import com.liuk.springboot.sys.vo.AreaVO;

import java.util.List;

/**
 * <p>
 * 区域表; InnoDB free: 34816 kB 服务类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface IAreaService extends IService<Area> {

    List<Area> getChildren(String parentId);

    AreaVO getAreaVoById(String id);

    List<JsTree> getAllAreaTree();

    List<AreaVO> getAreaVOList(String parentId);
}
