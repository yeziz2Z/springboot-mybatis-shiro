package com.liuk.springboot.mapper;

import com.liuk.springboot.entity.DictValue;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 字典值 Mapper 接口
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
public interface DictValueMapper extends BaseMapper<DictValue> {

    List<DictValue> getListByDictType(@Param("type") String type);

    String getDictLabel(@Param("type")String type,@Param("value") String value);
}
