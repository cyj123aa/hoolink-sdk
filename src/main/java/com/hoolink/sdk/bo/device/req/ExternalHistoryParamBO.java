package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;
import java.util.List;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import com.hoolink.sdk.param.PageParam;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 13:49
 * @Description
 */
@Data
public class ExternalHistoryParamBO extends PageParamBO implements Serializable {
    private String deviceName;
    private Long deviceTypeId;
    private List<Long> projectIdList;
    private Long startDate;
    private Long endDate;
}
