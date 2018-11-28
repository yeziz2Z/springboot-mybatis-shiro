package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.sys.vo.OfficeVO;
import com.liuk.springboot.sys.entity.Office;
import com.liuk.springboot.sys.mapper.OfficeMapper;
import com.liuk.springboot.sys.service.IOfficeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 机构表 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class OfficeServiceImpl extends ServiceImpl<OfficeMapper, Office> implements IOfficeService {

    @Override
    public List<JsTree> getAllOfficeTree() {
        return baseMapper.getAllOfficeTree();
    }

    @Override
    public OfficeVO getOfficeVoById(String id) {
        return baseMapper.getOfficeVoById(id);
    }
}
