package com.hoolink.sdk.bo.manager;

import lombok.Data;

/**
 * @Author : lys
 * @Date : 2019/7/8 16:32
 * @Instructions :
 */
@Data
public class EdmManageRoleBO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 父级角色
     */
    private Long parentId;

    /**
     * 所属层级
     */
    private Byte roleLevel;

    /**
     * 状态: 启用/禁用
     */
    private Boolean roleStatus;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 修改人
     */
    private Long updator;

    /**
     * 创建时间
     */
    private Long created;

    /**
     * 修改时间
     */
    private Long updated;

    /**
     * 数据有效性
     */
    private Boolean enabled;
    /**
     * <pre>
     * 角色类型【0：普通角色  1：文控角色】
     * 表字段 : manage_role.role_type
     * </pre>
     */
    private Boolean roleType;
}
