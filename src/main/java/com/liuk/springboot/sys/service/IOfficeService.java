package com.liuk.springboot.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.vo.OfficeVO;
import com.liuk.springboot.sys.entity.Office;

import java.util.List;

/**
 * <p>
 * 机构表 服务类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface IOfficeService extends IService<Office> {

    List<JsTree> getAllOfficeTree();

    OfficeVO getOfficeVoById(String id);

    List<OfficeVO> getOfficeVoListByParentId(String parentId);
}
