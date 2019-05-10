package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 用户查询参数
 *
 * @author zhangxin
 * @date 2019/4/17
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SearchUserBO extends PageParamBO implements Serializable {

    private static final long serialVersionUID = -4119004556645734623L;

    /*** 账号，模糊匹配 */
    private String fuzzyAccount;

    /*** 姓名，模糊匹配 */
    private String fuzzyName;

    /*** 手机号，模糊匹配 */
    private String fuzzyPhone;

    /*** 角色，模糊匹配 */
    private String fuzzyRole;

    /*** 角色ID集合 */
    private List<Long> roleIds;

    /*** 客户号 */
    private String customerNo;
    /*** 客户号集合 */
    private List<String> customerNos;

    /*** 用户状态 */
    private Boolean status;

    /*** 用户类型（该属性仅当前服务使用，不提供其他服务输入） 0 管理员， 1 普通用户 */
    private Byte type;

    /*** 项目ID */
    private Long projectId;

}
