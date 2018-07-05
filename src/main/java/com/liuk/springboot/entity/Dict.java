package com.liuk.springboot.entity;

import java.math.BigDecimal;
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
 * 字典表
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_dict")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class Dict extends Model<Dict> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 数据值
     */
    private String value;
    /**
     * 标签名
     */
    private String label;
    /**
     * 类型
     */
    private String type;
    /**
     * 描述
     */
    private String description;
    /**
     * 排序（升序）
     */
    private BigDecimal sort;
    /**
     * 父级编号
     */
    private String parentId;
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
     * 备注信息
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
