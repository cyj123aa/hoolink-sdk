package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-16 20:25.
 * <p>
 * description:
 */
@Data
public class MiddleRoleProjectMenuBO implements Serializable {
    private static final long serialVersionUID = 758499556737108719L;
    private Long id;
    /*** 角色ID */
    private Long roleId;
    /*** 项目ID(当项目ID为0时表示通用权限) */
    private Long projectId;
    /*** 权限ID */
    private Long menuId;
    /*** 只读或全部(0:全部:1:只读) */
    private Boolean readonly;
}
