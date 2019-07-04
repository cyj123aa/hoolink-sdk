package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/6/13 11:15
 */
@Data
public class DeviceShuttleBoxParamBO implements Serializable {

    private static final long serialVersionUID = -1569814001432437771L;
    /*** 设备类型 */
    private Long deviceType;

    /*** 过滤的设备子类型 */
    private Long outDeviceSubType;

    /*** 已被自己选择的设备ID集合 */
    private List<Long> beSelectDeviceIds;

    /*** 已被其他阈值记录选择的设备ID集合 */
    private List<Long> beOtherSelectDeviceIds;

    /*** 项目ID */
    private Long projectId;
}
