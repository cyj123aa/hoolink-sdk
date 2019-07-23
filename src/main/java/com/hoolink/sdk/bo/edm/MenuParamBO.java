package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @description: 菜单参数
 * @author: WeiMin
 * @date: 2019-05-20
 **/
@Data
public class MenuParamBO {
    /**
     * resourceId
     */
    private String id;

    /**
     * 所属id
     */
    private String belongId;

    /**
     * 资源类别
     */
    private Integer repertoryType;

    /**
     * 展示列表层级
     */
    private Integer level;
}
