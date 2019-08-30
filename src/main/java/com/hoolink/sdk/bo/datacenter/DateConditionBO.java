package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-28 17:48
 * @Description
 */
@Data
public class DateConditionBO  implements Serializable {

    /*** 项目ID */
    private Long projectId;

    /*** 开始日期（时间戳） */
    private Long startDate;

    /*** 结束日期（时间戳） */
    private Long endDate;
}
