package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-17 10:14.
 * <p>
 * description:
 */
@Data
public class SearchRoleBO extends PageParamBO implements Serializable {
    private static final long serialVersionUID = -7961715186130802278L;

    /*** 角色名称 */
    private String roleName;

    /*** 角色名称，模糊查询参数 */
    private String fuzzyName;

    /*** 角色状态 */
    private Boolean roleStatus;

    /*** 客户号 */
    private String customerNo;

    /*** 角色是否显示，0 隐藏  1 显示 */
    private Boolean display;
}
