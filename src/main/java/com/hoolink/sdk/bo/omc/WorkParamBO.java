package com.hoolink.sdk.bo.omc;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkParamBO extends PageParamBO {
    private Long projectId;
    private Byte priority;
    private String type;
    private Byte orderStatus;
    private Boolean overdue;
}
