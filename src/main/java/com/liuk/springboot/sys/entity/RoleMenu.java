package com.liuk.springboot.sys.entity;

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
 * 角色-菜单
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_role_menu")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class RoleMenu extends Model<RoleMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    @TableId(value = "role_id", type = IdType.UUID)
    private String roleId;
    /**
     * 菜单编号
     */
    private String menuId;

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
