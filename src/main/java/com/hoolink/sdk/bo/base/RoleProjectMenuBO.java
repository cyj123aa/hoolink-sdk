package com.hoolink.sdk.bo.base;

import lombok.Data;

/**
 * @author cyj
 */
@Data
public class RoleProjectMenuBO {
    private Long roleId;

    private Long projectId;
    /**
     * <pre>
     * 对应权限id
     * 表字段 : middle_role_project_menu.menu_id
     * </pre>
     */
    private Long menuId;


    /**
     * <pre>
     * 更改权限:只读读写
     * 表字段 : middle_role_project_menu.readonly
     * </pre>
     */
    private Boolean readonly;
}
