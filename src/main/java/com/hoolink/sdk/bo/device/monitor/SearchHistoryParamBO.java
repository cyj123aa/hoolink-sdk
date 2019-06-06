package com.hoolink.sdk.bo.device.monitor;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/5/31
 * @Desc
 */
@Data
public class SearchHistoryParamBO extends PageParamBO {

    /** 项目id */
    private Long projectId;

    /** 监控器id */
    private Long monitorId;

    /** 开始日期 */
    private String beginTime;

    /** 结束日期 */
    private String endTime;
}
