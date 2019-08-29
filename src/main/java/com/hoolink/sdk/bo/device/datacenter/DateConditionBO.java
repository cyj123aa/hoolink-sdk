package com.hoolink.sdk.bo.device.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-28 17:48
 * @Description
 */
@Data
public class DateConditionBO  implements Serializable {

    private Long projectId;
    private Long startDate;
    private Long endDate;
}
