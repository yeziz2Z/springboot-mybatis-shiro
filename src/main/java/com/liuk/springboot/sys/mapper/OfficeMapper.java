package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.vo.OfficeVO;
import com.liuk.springboot.sys.entity.Office;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 机构表 Mapper 接口
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface OfficeMapper extends BaseMapper<Office> {

    List<JsTree> getAllOfficeTree();

    OfficeVO getOfficeVoById(@Param("id") String id);

    List<OfficeVO> getOfficeVoListByParentId(@Param("parentId")String parentId);
}
