package com.liuk.springboot.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 字典值
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_dict_value")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class DictValue extends Model<DictValue> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 标签名
     */
    private String dictTypeId;
    /**
     * 键值
     */
    private String label;
    /**
     * 排序
     */
    private String value;
    /**
     * 外键
     */
    private String sort;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
