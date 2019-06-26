package com.hoolink.sdk.bo.omc;

import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class ApprovalBO extends OperateBO{

    /**
     * 审批状态   1通过， 2，驳回
     */
    private Boolean  approval;

    /**
     * 预设值
     */
    private Byte orderStatusPre;
    /**
     * 转派人ID
     */
    private Long transferPeopleId;

    /**
     * 延期时间
     */
    private Long extension;
    /**
     * 操作类型
     */
    private Byte orderType;

}
