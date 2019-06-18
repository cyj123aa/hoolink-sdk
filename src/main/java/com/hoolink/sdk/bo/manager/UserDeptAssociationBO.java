package com.hoolink.sdk.bo.manager;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author : chenzb
 * @Description : TODO
 * @date : Created on 2019/5/30 16:31
 */
@Data
public class UserDeptAssociationBO {

    /*** 组织架构id */
    private Long deptId;

    /*** 组织架构名称 */
    private String deptName;

    /*** 1-公司 2-部门 3-小组 */
    private Byte deptType;

    /*** 密保等级 */
    private Integer encryLevelDept;
}
