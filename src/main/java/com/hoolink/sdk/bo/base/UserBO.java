package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-13 16:24.
 * <p>
 * description:
 * *
 */
@Data
public class UserBO implements Serializable {
    private static final long serialVersionUID = 6053988645039028148L;
    /*** 用户ID */
    private Long id;
    /*** 用户账号 */
    private String account;
    /*** 用户名称 */
    private String name;
    /*** 用户性别 */
    private Boolean sex;
    /*** 角色ID */
    private Long roleId;
    /*** 角色名称 */
    private String roleName;
    /*** 密码 */
    private String password;
    /*** 头像ID */
    private Long imageId;
    /*** 手机号 */
    private String phone;
    /*** 第一次登录 */
    private Boolean firstLogin;
    /*** 重置密码 */
    private Boolean resetPassword;
    /*** 最后一次登录时间 */
    private Long lastTime;
    /*** 最后一次登录的项目 */
    private Long lastProjectId;
    /*** 用户状态(启用禁用) */
    private Boolean status;
    /*** 客户号 */
    private String customerNo;

}