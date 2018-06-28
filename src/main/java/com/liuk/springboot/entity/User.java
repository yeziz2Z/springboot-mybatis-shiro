package com.liuk.springboot.entity;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 *
 * Created by kl on 2018/6/14.
 */
@Data
@ToString
public class User extends BaseEntity{

    private String companyId;

    private String officeId;

    private String loginName;

    private String password;

    private String no;

    private String name;

    private String email;

    private String phone;

    private String mobile;

    private String photo;

    private String loginIp;

    private Date loginDate;

    private String loginFlag;

    private String qrCode;

    private String sign;

}
