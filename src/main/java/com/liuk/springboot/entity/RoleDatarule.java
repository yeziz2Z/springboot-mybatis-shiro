package com.liuk.springboot.entity;

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
 * 角色数据权限表
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_role_datarule")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class RoleDatarule extends Model<RoleDatarule> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId(value = "role_id", type = IdType.UUID)
    private String roleId;
    /**
     * 数据规则id
     */
    private String dataruleId;

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
