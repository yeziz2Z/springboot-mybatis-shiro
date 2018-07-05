package com.liuk.springboot.entity;

import com.baomidou.mybatisplus.annotations.TableField;
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
 * 数据规则; InnoDB free: 34816 kB
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_datarule")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class Datarule extends Model<Datarule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 所属菜单
     */
    private String menuId;
    /**
     * 数据规则名称
     */
    private String name;
    /**
     * 规则字段
     */
    private String tField;
    /**
     * 规则条件
     */
    private String tExpress;
    /**
     * 规则值
     */
    private String tValue;
    /**
     * 自定义sql
     */
    private String sqlSegment;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;
    /**
     * 实体类名
     */
    @TableField("className")
    private String className;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
