package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/6/10 11:29
 */
@Data
public class OrganizationDeptBO {

    private String deptName;
    private String groupName;
    private String companyName;
    private String systemCenterName;
    /**
     * id
     */
    private Long deptId;
}
