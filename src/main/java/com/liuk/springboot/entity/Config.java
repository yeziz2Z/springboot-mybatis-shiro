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
 * 系统配置
 * </p>
 *
 * @author liuk
 * @since 2018-07-05
 */
@TableName("sys_config")
@Data
@ToString
@Accessors(chain = true)
@NoArgsConstructor
public class Config extends Model<Config> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 邮箱服务器地址
     */
    private String smtp;
    /**
     * 邮箱服务器端口
     */
    private String port;
    /**
     * 系统邮箱地址
     */
    private String mailname;
    /**
     * 系统邮箱密码
     */
    private String mailpassword;
    /**
     * 短信用户名
     */
    private String smsname;
    /**
     * 短信密码
     */
    private String smspassword;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
