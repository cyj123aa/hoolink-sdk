package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/4/18
 */
@Data
public class LoginResponseBO implements Serializable {

    private static final long serialVersionUID = -7877838117943889756L;

    /*** 用户名 */
    private String userName;

    /*** 头像id */
    private Long imageId;

    /*** 角色ID */
    private Long roleId;

    /*** 绑定手机标识 */
    private Boolean bindPhone;

    /*** Token */
    private String token;

    /*** 第一次登录 */
    private Boolean firstLogin;

    /*** 修改密码标识 */
    private Boolean resetPassword;

    /*** 最后一次登录的项目 */
    private Long lastProjectId;
}
