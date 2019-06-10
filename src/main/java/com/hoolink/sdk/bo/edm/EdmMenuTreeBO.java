package com.hoolink.sdk.bo.edm;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/17 10:44
 */
@Data
public class EdmMenuTreeBO implements Serializable {
    private static final long serialVersionUID = -2649250362604180026L;

    /*** 菜单名称 */
    private String title;

    /*** 菜单id */
    private String value;

    /*** 菜单ID */
    private Long key;

    /*** 子节点 */
    private List<EdmMenuTreeBO> children;

    /**
     * code码
     */
    private String code;

    /**
     * 资源库
     */
    private Integer type;

    /*** 是否可以操作 */
    private Boolean enableUpdate;

    /*** 1：只读\ 2：全部 */
    private Integer readOnly;

    /** 父节点id */
    private Long parentId;
}
