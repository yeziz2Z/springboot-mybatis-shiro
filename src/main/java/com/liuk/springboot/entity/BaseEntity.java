package com.liuk.springboot.entity;

import com.liuk.springboot.sys.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kl
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 唯一编号
     */
    protected String id;

    /**
     * 备注
     */
    protected String remarks;

    /**
     * 删除标识
     */
    protected String delFlag;

    /**
     * 创建日期
     */
    protected Date createDate;

    /**
     * 修改日期
     */
    protected Date updateDate;

    /**
     * 创建人
     */
    protected User createBy;

    /**
     * 更新者
     */
    protected User updateBy;


}
