package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/6/12 13:46
 */
@Data
public class ManageUserDeptBO {
    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 类型
     * 1-公司 2-部门 3-小组
     */
    private Integer deptType;

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
