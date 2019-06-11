package com.hoolink.sdk.bo.manager;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/5/29 19:29
 */
@Data
public class ManageDepartmentTreeBO implements Serializable {

    private static final long serialVersionUID = 7728059630076949882L;
    /** 组织架构id */
    private Long key;

    /** 组织架构名称 */
    private String title;

    /** 组织架构id */
    private String value;

    /*** 部门资源或资源库中的父节点层级code */
    private String parentIdCode;

    /** 组织类型 */
    private Byte deptType;

    /** 父节点id */
    private Long parentId;

    /*** 是否展开子节点 */
    private Boolean expand;

    /*** 是否勾选 */
    private Boolean checked;

    /*** 组织架构下的子节点*/
    private List<ManageDepartmentTreeBO> children;

    /** 组织架构下的人员 */
    private List<SimpleDeptUserBO> userList;
}
