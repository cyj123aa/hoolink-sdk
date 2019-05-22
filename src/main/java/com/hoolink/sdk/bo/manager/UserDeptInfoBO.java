package com.hoolink.sdk.bo.manager;

import lombok.Data;

import java.util.Map;

/**
 * @description: 用户所属信息
 * @author: WeiMin
 * @date: 2019-05-22
 **/
@Data
public class UserDeptInfoBO {
    private Long id;

    /**
     * 资源库密保等级（1-一级,2-二级,3-三级,4-四级）
     */
    private Integer encryLevelCompany;

    /**
     * id,密保等级（部门）
     */
    private Map<String,String> deptMap;
}
