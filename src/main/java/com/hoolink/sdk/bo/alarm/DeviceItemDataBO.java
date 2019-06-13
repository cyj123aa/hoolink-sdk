package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangxin
 * @date 2019/6/13
 */
@Data
public class DeviceItemDataBO implements Serializable {

    private static final long serialVersionUID = 8937869238968685568L;

    /*** 配置项ID */
    private Long configItemId;

    /*** 设备上报值 */
    private Double deviceItemValue;

    /*** 阈值上限 */
    private Double upperBound;

    /*** 阈值下限 */
    private Double lowerBound;
}
