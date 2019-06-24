package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class ApprovalBO extends OperateBO{

    /**
     * 审批状态 3成功4失败  7通过， 8，驳回
     */
    private Byte  approval;

    /**
     * 预设值
     */
    private Byte orderStatusPre;

}
