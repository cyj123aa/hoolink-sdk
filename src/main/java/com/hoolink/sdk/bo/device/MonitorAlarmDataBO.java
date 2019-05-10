package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * 环境监测报警数据类
 *
 * @author zhangxin
 * @date 2018/12/20
 */
@Data
public class MonitorAlarmDataBO {

    /**
     * 监控器UID
     */
    private String uid;

    /**
     * 漏电设备类型: 0. 传感器异常  1. 水位检测  2. 220V电源
     */
    private Integer deviceType;

    /**
     * 220V漏电时代表漏电多少MA，水位时为多少M
     */
    private Integer value;

}
