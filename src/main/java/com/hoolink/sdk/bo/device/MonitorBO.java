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

    /*** 是否有环境检测传感器 */
    private Boolean hasEnvironment;

    /*** 是否有气体检测传感器 */
    private Boolean hasGas;

    /*** 是否有漏电检测传感器 */
    private Boolean hasLeakage;

    /*** 是否有水位检测传感器 */
    private Boolean hasWaterLevel;

    /*** 环境检测传感器实体 */
    private SensorEnvironmentBO sensorEnvironment;

    /*** 气体检测传感器实体 */
    private SensorGasBO sensorGas;

    /*** 漏电检测传感器实体 */
    private SensorLeakageBO sensorLeakage;

    /*** 水位检测传感器实体 */
    private SensorWaterLevelBO sensorWaterLevel;
}
