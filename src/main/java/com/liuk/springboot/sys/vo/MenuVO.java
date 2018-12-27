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
public class MenuVO {
    /**
     * 编号
     */
    private String id;
    /**
     * 父级编号
     */
    private String parentId;
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
     * 链接
     */
    private String href;
    /**
     * 菜单编号(APP识别)
     */
    private String menuCode;
    /**
     * 自定义图标
     */
    private String iconUrl;
    /**
     * 是否受控制(是否登录后才能查看到)
     */
    private Integer isControl;
    /**
     * 自定义参数的携带
     */
    private String parameter;
    /**
     * 目标
     */
    private String target;
    /**
     * 图标
     */
    private String icon;
    /**
     * 是否在菜单中显示
     */
    private String isShow;
    /**
     * 权限标识
     */
    private String permission;
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
     * 0:功能菜单  1：菜单  2：按钮  3：数据权限
     */
    private String menuType;

    /**
     * 是否有子节点
     */
    private boolean hasChildren;
}
