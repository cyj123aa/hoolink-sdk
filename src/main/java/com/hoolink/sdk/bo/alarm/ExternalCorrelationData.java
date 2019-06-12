package com.hoolink.sdk.bo.alarm;

import lombok.Data;

/**
 * @author zhangxin
 * @date 2019/6/12
 */
@Data
public class ExternalCorrelationData extends DeviceCorrelationData {

    private static final long serialVersionUID = -9084694533259796124L;

    /*** 集中器存在故障 */
    private Boolean externalHasFault;
}
