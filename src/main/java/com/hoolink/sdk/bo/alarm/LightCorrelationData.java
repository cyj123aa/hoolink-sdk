package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zhangxin
 * @date 2019/6/12
 */
@Data
public class LightCorrelationData implements Serializable {

    private static final long serialVersionUID = 3405621574159386288L;

    /*** 设备ID */
    private Long deviceId;

    /*** true 恢复  false 故障 */
    private Map<Long, Integer> faultData;

    /*** 存在ACK的单灯 */
    private Map<Long, Integer> recoveryData;
}
