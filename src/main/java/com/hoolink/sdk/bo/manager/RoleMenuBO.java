package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @Author: xuli
 * @Date: 2019/5/29 14:04
 */
@Data
public class RoleMenuBO {

    private Long menuId;

    /**
     * 权限级别
     */
    private Integer permissionFlag;

    private String menuCode;
}
