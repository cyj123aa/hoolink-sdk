package com.hoolink.sdk.bo.omc;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkParamBO extends PageParamBO {

    /**
     * 项目id
     */
    private Long projectId;
    /**
     * 流程id
     */
    private Long processId;
    /**
     * 紧急状态
     */
    private Byte priority;
    /**
     *  工单类型
     */
    private String type;
    /**
     *  工单状态
     */
    private Byte orderStatus;
    /**
     * 是否逾期
     */
    private Boolean overdue;
}
