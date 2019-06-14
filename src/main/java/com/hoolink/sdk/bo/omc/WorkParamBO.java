package com.hoolink.sdk.bo.omc;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class WorkParamBO extends PageParamBO {
    private Long projectId;
    private Integer priority;
    private String type;
    private Integer orderStatus;
    private Boolean overdue;
}
