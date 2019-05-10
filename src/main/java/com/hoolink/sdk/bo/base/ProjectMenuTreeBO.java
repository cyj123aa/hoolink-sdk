package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/17 10:44
 */
@Data
public class ProjectMenuTreeBO implements Serializable {
    private static final long serialVersionUID = -2649250362604180026L;

    /*** 菜单名称 */
    private String title;

    /*** 菜单名称 */
    private String value;

    /*** 菜单ID */
    private Long key;

    /*** 子节点 */
    private List<ProjectMenuTreeBO> children;

    /*** 只读\全部 */
    private Boolean readonly;
}
