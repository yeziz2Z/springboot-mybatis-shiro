package com.liuk.springboot.sys.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liuk.springboot.common.JsTree;
import com.liuk.springboot.entity.DictValue;
import com.liuk.springboot.mapper.DictValueMapper;
import com.liuk.springboot.sys.entity.Area;
import com.liuk.springboot.sys.mapper.AreaMapper;
import com.liuk.springboot.sys.service.IAreaService;
import com.liuk.springboot.sys.vo.AreaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 区域表; InnoDB free: 34816 kB 服务实现类
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService {

    @Autowired
    private DictValueMapper dictValueMapper;
    @Override
    public List<Area> getChildren(String parentId) {
        EntityWrapper wrapper = new EntityWrapper<Area>();
        wrapper.setEntity(new Area().setParentId(parentId));
        return baseMapper.selectList(wrapper);
    }

    @Override
    public AreaVO getAreaVoById(String id) {
        return baseMapper.getAreaVoById(id);
    }

    @Override
    public List<JsTree> getAllAreaTree() {
        return baseMapper.getAllAreaTree();
    }

    @Override
    public List<AreaVO> getAreaVOList(String parentId) {
        List<AreaVO> areaVOList = baseMapper.getAreaVOList(parentId);
        areaVOList.forEach(areaVO -> {
            areaVO.setTypeName(dictValueMapper.getDictLabel("sys_area_type",areaVO.getType()));
        });
        return areaVOList;
    }
}
