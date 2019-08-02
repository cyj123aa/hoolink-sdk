package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/4/18
 */
@Data
public class UpdateUserBO implements Serializable {

    private static final long serialVersionUID = 2194489652645668277L;

    /*** 主键 */
    @NotNull(message = "主键不允许为空", groups = {Group.Admin.class, Default.class})
    private Long id;

    /*** 角色ID */
    @NotNull(message = "角色不允许为空", groups = Group.User.Role.class)
    private Long roleId;

    /*** 姓名 */
    @NotBlank(message = "姓名不允许为空", groups = {Group.User.Name.class, Group.Admin.class})
    private String name;

    /*** 性别 */
    @NotNull(message = "性别不允许为空", groups = Group.User.Sex.class)
    private Boolean sex;

    /*** 头像ID */
    @NotNull(message = "头像不允许为空", groups = Group.User.Image.class)
    private Long imageId;

    /*** 状态 */
    @NotNull(message = "状态不允许为空", groups = Group.User.Status.class)
    private Boolean status;

}
