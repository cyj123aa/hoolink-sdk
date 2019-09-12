package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-12 17:11
 * @Description
 */
@Data
public class DeviceStatusCountBO implements Serializable {

    /*** 近一个小时设备在线趋势 */
    private TrendGraphBO hourTrendGraph;

    /*** 设备在保/过保统计数据 */
    private WorkStatusBO deviceWarranty;

    /*** 设备工作中/设备总数统计数据 */
    private WorkStatusBO deviceWork;

    /*** 设备总量 */
    private Long deviceTotal;

    /*** 设备健康等级 */
    private String deviceHeathLevel;

    /*** 状态数量 */
    private List<NameAndNumBO> statusNum;

    /*** 设备离线率 */
    private String offlinePercent;

    /*** 设备故障率 */
    private String faultPercent;

    /*** 设备在线率 */
    private List<ValueAndNameBO> onlinePercent;


}
