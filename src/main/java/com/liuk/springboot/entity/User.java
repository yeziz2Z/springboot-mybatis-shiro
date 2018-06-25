package com.liuk.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 *
 * Created by kl on 2018/6/14.
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
public class User {
    private String id;
    private Integer age;
    private String username;

    private String password;



}
