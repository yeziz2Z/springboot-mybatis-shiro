package com.liuk.springboot.common;

import lombok.Data;

import java.util.List;

@Data
public class JsTree {
    private String key;
    private String title;
    private String parentId;


    private List<JsTree> children;
}
