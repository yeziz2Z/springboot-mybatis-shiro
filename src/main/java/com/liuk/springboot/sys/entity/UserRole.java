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
 * 用户-角色
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_user_role")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "user_id", type = IdType.UUID)
    private String userId;
    /**
     * 角色编号
     */
    private String roleId;

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
