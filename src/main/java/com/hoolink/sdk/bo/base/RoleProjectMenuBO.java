package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cyj
 */
@Data
public class RoleProjectMenuBO implements Serializable {
    private static final long serialVersionUID = -3911279475478406439L;

    /*** 角色ID */
    private Long roleId;
    /*** 项目ID */
    private Long projectId;
    /*** 对应权限id  */
    private Long menuId;
    /*** 更改权限:只读读写 */
    private Boolean readonly;
    /*** 菜单类型 */
    private Byte menuType;
    /*** 场景ID */
    private Long sceneId;
}
