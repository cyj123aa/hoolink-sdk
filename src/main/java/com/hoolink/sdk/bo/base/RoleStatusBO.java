package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-18 14:06.
 * <p>
 * description:
 */
@Data
public class RoleStatusBO implements Serializable {
    private static final long serialVersionUID = 165541286473491227L;
    /*** 角色ID */
    private Long roleId;
    /*** 状态 */
    private Boolean status;
}
