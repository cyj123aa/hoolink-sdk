package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @description
 * @date 2019/4/3 13:43
 **/
@Data
public class MonitorBO extends DeviceManagerBO {

    private static final long serialVersionUID = -7513629119179355807L;

    private Long id;

    /*** 设备通道号 */
    private String channelNo;

    /*** 监控器IP */
    private String monitorIp;

    /*** 监控器子网掩码 */
    private String monitorMask;

    /*** 监控器网关 */
    private String monitorGateway;

    /*** 最后通讯时间 */
    private Long lastTime;
}
