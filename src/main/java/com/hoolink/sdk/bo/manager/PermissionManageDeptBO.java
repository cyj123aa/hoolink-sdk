package com.hoolink.sdk.bo.manager;

import lombok.Data;

import java.util.List;

/**
 * @author : chenzb
 * @Description : TODO
 * @date : Created on 2019/6/12 17:22
 */
@Data
public class PermissionManageDeptBO {

    /*** 当前人所在部门或者公司的组织架构信息 */
    private List<ManageDepartmentTreeBO> manageDepartmentList;

    /*** 所有的组织架构信息 */
    private List<ManageDepartmentTreeBO> allManageDepartmentList;
}
