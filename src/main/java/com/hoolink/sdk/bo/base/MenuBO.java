package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-16 13:33.
 * <p>
 * description:
 */
@Data
public class MenuBO implements Serializable {
    private static final long serialVersionUID = 3064431972216502696L;

    /*** 主键 */
    private Long id;

    /*** 菜单名称 */
    private String name;

    /*** 菜单code */
    private String code;

    /*** 只读或隐藏(0:默认 1:只读 2:隐藏) */
    private Byte type;

    /*** 描述 */
    private String description;

    /*** 父菜单ID */
    private Long parentId;
}
