package com.hoolink.sdk.bo.manager;

import lombok.Data;

import java.util.List;

/**
 * @description: EDM系统菜单列表
 * @author: WeiMin
 * @date: 2019-05-20
 **/
@Data
public class EdmMenuBO {
    private Long id;

    private String menuName;

    private String menuCode;

    private Integer permissionFlag;

    /**
     * 0:文件 1：文件夹
     */
    private Boolean resourceType;
    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 下级菜单
     */
    private List<EdmMenuBO> edmMenuVOList;

}
