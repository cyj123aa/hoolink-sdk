package com.hoolink.sdk.bo.manager;

import lombok.Data;

import java.util.List;

/**
 * @description: 初始化菜单
 * @author: WeiMin
 * @date: 2019-05-20
 **/
@Data
public class InitMenuBO {
    /**
     * 部门资源菜单列表
     */
    private EdmMenuBO deptVO;
    /**
     * 资源库资源菜单列表
     */
    private EdmMenuBO companyVO;
    /**
     * 缓存库资源菜单列表
     */
    private EdmMenuBO cacheVO;

    /**
     * 对外公开资源菜单列表
     */
    private EdmMenuBO publicVO;
}
