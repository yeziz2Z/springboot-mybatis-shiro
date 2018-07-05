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
 * 定时任务
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_schedule")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class Schedule extends Model<Schedule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 任务名
     */
    private String name;
    /**
     * 任务组
     */
    private String tGroup;
    /**
     * 定时规则
     */
    private String expression;
    /**
     * 启用状态
     */
    private String status;
    /**
     * 通知用户
     */
    private String isInfo;
    /**
     * 任务类
     */
    private String classname;
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
