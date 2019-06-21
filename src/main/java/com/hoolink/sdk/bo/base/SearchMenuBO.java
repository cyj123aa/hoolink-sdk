package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/19
 */
@Data
public class SearchMenuBO implements Serializable {

    private static final long serialVersionUID = 6536087399563878147L;

    /*** 角色ID */
    private Long roleId;
    /*** 项目ID */
    private Long projectId;
}
