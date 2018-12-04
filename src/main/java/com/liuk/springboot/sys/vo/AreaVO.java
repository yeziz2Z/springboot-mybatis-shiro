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
public class AreaVO {
    /**
     * 编号
     */
    private String id;
    /**
     * 父级编号
     */
    private String parentId;
    /**
     * 父级名称
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
     * 区域编码
     */
    private String code;
    /**
     * 区域类型
     */
    private String type;

    /**
     * 区域类型名称
     */
    private String typeName;
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
