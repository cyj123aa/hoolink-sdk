package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * @author XuBaofeng.
 * @date 2019-04-13 16:24.
 * <p>
 * description:
 * * 当前登录的用户信息
 */
@Data
public class CurrentUserBO implements Serializable {

    private static final long serialVersionUID = -5931221769494765859L;

    /*** token验证值 */
    private String token;

    /*** 登录账号用户信息 */
    private String account;

    /*** 登录账号用户ID */
    private Long userId;

    /*** 客户编号 */
    private String customerNo;

    /*** 用户类型 */
    private Byte userType;

    /*** 登录用户的权限菜单URL */
    private Map<String, Set<String>> authUrls;

    /** 手机号*/
    private String phone;
    /** 角色编号 **/
    private Long roleId;
    /** 角色层级 **/
    private Byte roleLevel;
    /** 所属公司 **/
    private Set<Long> comanyIdSet;
    /** 权限url**/
    private Set<String> accessUrlSet;
    /** 姓名*/
    private String userName;
}
