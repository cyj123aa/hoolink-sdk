package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-26 9:40.
 * <p>
 * description:
 */
@Data
public class ProjectMenuBO implements Serializable {
    private static final long serialVersionUID = 1384846657958191872L;

    private Long key;

    private String title;

    private List<ProjectMenuTreeBO> children;
}
