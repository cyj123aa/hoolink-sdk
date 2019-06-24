package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/31
 * @Desc
 */
@Data
public class SearchHistoryBO implements Serializable {

    private static final long serialVersionUID = 7807219766065316619L;
    /** 项目id */
    private Long projectId;

    /** 监控器id */
    private Long monitorId;

    /** 开始日期 */
    private Long beginTime;

    /** 结束日期 */
    private Long endTime;
}
