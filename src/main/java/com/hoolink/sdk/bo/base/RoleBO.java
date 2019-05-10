package com.hoolink.sdk.bo.base;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-16 13:25.
 * <p>
 * description:
 */
@Data
public class RoleBO implements Serializable {
    private static final long serialVersionUID = 8161552406499137963L;

    @NotNull(message = "角色编号不允许为空", groups = {Group.Role.Update.class})
    private Long id;

    /*** 角色名称 */
    @NotBlank(message = "角色名称不允许为空", groups = {Group.Role.Create.class, Group.Role.Update.class})
    private String name;

    /*** 角色状态: 启用/禁用 */
    private Boolean status;

    /*** 角色描述 */
    @NotBlank(message = "角色描述不允许为空", groups = {Group.Role.Create.class, Group.Role.Update.class})
    private String description;

    /*** 客户号 */
    @NotBlank(message = "客户号不允许为空", groups = {Group.Role.Create.class, Group.Role.Update.class})
    private String customerNo;

    /*** 该角色所拥有的菜单权限 */
    private List<MiddleRoleProjectMenuBO> projectMenus;
}
