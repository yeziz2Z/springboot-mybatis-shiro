package com.liuk.springboot.sys.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 字典类型
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_dict_type")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class DictType extends Model<DictType> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 类型
     */
    private String type;
    /**
     * 描述
     */
    private String description;
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
