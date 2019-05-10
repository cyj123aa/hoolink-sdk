package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-18 11:51.
 * <p>
 * description:
 */
@Data
public class CustomerMenuBO implements Serializable {
    private static final long serialVersionUID = -1618319850104349917L;

    /*** 所有权限 */
    private List<ProjectMenuTreeBO> allMenus;
    /*** 客户已选权限 */
    private List<ProjectMenuTreeBO> beSelectMenus;

}
