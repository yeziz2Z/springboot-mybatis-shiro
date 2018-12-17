package com.liuk.springboot.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuk.springboot.sys.entity.DictValue;
import org.apache.ibatis.annotations.Param;

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

    String getDictLabel(@Param("type") String type, @Param("value") String value);
}
