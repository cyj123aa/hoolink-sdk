package com.hoolink.sdk.bo.device.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-12 17:06
 * @Description
 */
@Data
public class WorkStatusBO implements Serializable {

    /*** 分子（在保设备，工作中，已延期，已完成） */
    private Long molecule;

    /*** 占比值 */
    private Long percent;

    /*** 分母（过保设备，设备总数，工单总数）*/
    private Long total;
}
