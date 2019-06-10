package com.hoolink.sdk.bo.device.inspection;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/5/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SearchInspectorBO extends PageParam implements Serializable {

    private static final long serialVersionUID = 3015238377364658810L;

    /*** 项目ID */
    private Long projectId;

    /*** 编号，模糊查询条件 */
    private String fuzzyNumber;

    /*** 姓名，模糊查询条件 */
    private String fuzzyName;

    /*** 手机号，模糊查询条件 */
    private String fuzzyMobile;

    /*** 状态 */
    private Boolean status;
}
