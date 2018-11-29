package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.entity.Area;
import com.liuk.springboot.sys.vo.AreaVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 区域表; InnoDB free: 34816 kB Mapper 接口
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface AreaMapper extends BaseMapper<Area> {

    List<JsTree> getAllAreaTree();

    AreaVO getAreaVoById(@Param("id") String id);

    List<AreaVO> getAreaVOList(@Param("parentId") String parentId);
}
