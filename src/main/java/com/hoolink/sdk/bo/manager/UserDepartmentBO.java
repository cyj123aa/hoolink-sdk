package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/5/29 16:15
 */
@Data
public class UserDepartmentBO{
    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 所属部门
     */
    private String deptName;

    /**
     * 部门密保等级(1-一级,2-二级,3-三级,4-四级)
     */
    private Integer encryLevelDept;

    /**
     * 部门密保等级
     */
    private String encryLevelDeptName;
}