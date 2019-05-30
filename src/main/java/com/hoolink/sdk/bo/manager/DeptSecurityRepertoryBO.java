package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @Author: xuli
 * @Date: 2019/5/30 11:33
 */
@Data
public class DeptSecurityRepertoryBO {

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 部门类型
     */
    private Byte deptType;

    /**
     * 部门密保等级
     */
    private Integer encryLevelDept;

    /**
     * 资源库密保等级
     */
    private Integer encryLevelCompany;
}
