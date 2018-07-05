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
 * 
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_user_friend")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class UserFriend extends Model<UserFriend> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;
    @TableField("userId")
    private String userId;
    @TableField("friendId")
    private String friendId;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
