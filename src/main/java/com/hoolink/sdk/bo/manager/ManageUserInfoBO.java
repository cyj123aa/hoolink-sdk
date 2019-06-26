package com.hoolink.sdk.bo.manager;

import java.util.List;
import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/6/12 13:45
 */
@Data
public class ManageUserInfoBO {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 员工编号
     */
    private String userNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 职位
     */
    private String position;

    /**
     * 所属角色id
     */
    private Long roleId;

    /**
     * 所属角色
     */
    private String roleName;

    /**
     * 所属公司
     */
    private String company;
    /**
     * 所属公司id
     */
    private Long companyId;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 资源库密保等级（1-一级,2-二级,3-三级,4-四级）
     */
    private Integer encryLevelCompany;

    /**
     * 资源库密保等级
     */
    private String encryLevelCompanyName;

    /**
     * 账号状态: 启用/禁用
     */
    private Boolean status;

    /**
     * 账号状态: 启用/禁用
     */
    private String statusDesc;

    /**
     * 性别: 1/0 男/女
     */
    private Boolean sex;

    /**
     * 性别
     */
    private String sexDesc;

    /**
     *创建时间
     */
    private Long created;

    /**
     * 末次登陆时间
     */
    private Long lastTime;

    /**
     * 用户部门关系
     */
    private List<ManageUserDeptBO> userDeptPairList;
}