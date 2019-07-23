package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 创建用户
 *
 * @author zhangxin
 * @date 2019/4/16
 */
@Data
public class CreateUserBO implements Serializable {

    private static final long serialVersionUID = 3991961578462468277L;

    /*** 用户账号 */
    @NotBlank(message = "账号不允许为空", groups = {Group.Admin.class, Group.User.class})
    private String account;
    /*** 用户名称 */
    @NotBlank(message = "姓名不允许为空", groups = {Group.Admin.class, Group.User.class})
    private String name;
    /*** 用户性别 */
    @NotNull(message = "性别不允许为空", groups = {Group.Admin.class, Group.User.class})
    private Boolean sex;
    /*** 角色ID */
    @NotNull(message = "角色不允许为空", groups = {Group.User.class})
    private Long roleId;
    /*** 手机号 */
    @NotBlank(message = "手机号不允许为空", groups = {Group.Admin.class})
    private String phone;
    /*** 客户号 */
    @NotBlank(message = "客户号不允许为空", groups = {Group.Admin.class})
    private String customerNo;
    /*** 用户头像 */
    private Long imageId;
    /*** 用户状态 */
    private Boolean status;
}
