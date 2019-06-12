package com.hoolink.sdk.bo.alarm;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

/**
 * @author zhangxin
 * @date 2019/6/12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExternalCorrelationData extends DeviceCorrelationData {

    private static final long serialVersionUID = -9084694533259796124L;

    /*** true 恢复  false 故障 */
    private Boolean externalOnlineStatus;

    /*** true 恢复  false 故障 */
    private Boolean externalAckStatus;

    /*** 存在ACK的单灯，有value故障，没有value恢复 */
    private Map<String, String> lightAckMap;

    /*** 单灯故障类型和数据 */
    private Map<String, Map<Long, Integer>> lightDataMap;
}
