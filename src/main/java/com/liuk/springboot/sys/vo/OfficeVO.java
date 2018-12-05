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
public class OfficeVO {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String id;
    /**
     * 父级编号
     */
    private String parentId;

    /**
     * 父级机构名称
     */
    private String parentName;
    /**
     * 所有父级编号
     */
    private String parentIds;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 归属区域
     */
    private String areaId;

    /**
     * 归属区域名称
     */
    private String areaName;
    /**
     * 区域编码
     */
    private String code;
    /**
     * 机构类型
     */
    private String type;
    /**
     * 机构等级
     */
    private String grade;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 负责人
     */
    private String master;
    /**
     * 电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 是否启用
     */
    private String useable;
    /**
     * 主负责人
     */
    private String primaryPerson;
    /**
     * 副负责人
     */
    private String deputyPerson;
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

    /**
     * 是否有子节点
     */
    private boolean hasChildren;
}
