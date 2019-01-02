package com.liuk.springboot.sys.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class RoleVO {
    /**
     * 编号
     */
    private String id;
    /**
     * 归属机构
     */
    private String officeId;

    /**
     * 归属机构名称
     */
    private String officeName;

    /**
     * 角色名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String enname;
    /**
     * 角色类型
     */
    private String roleType;
    /**
     * 是否系统数据
     */
    private String isSys;
    /**
     * 是否可用
     */
    private String useable;
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

}
