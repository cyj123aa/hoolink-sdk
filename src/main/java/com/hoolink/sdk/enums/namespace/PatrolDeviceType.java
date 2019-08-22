package com.hoolink.sdk.enums.namespace;

/**
 * @author update lixiaoran
 * @date 2019-08-22
 */

public enum PatrolDeviceType {

    /**
     *5000L5(L3)设备（目前开发的都是这种设备类型）
     */
    WM5000L5,
    /**
     *厂家已有的其他设备类型（我们这边暂时没有开发）
     */
    WM5000LT,
    /**
     *5000P5(P3) 设备
     */
    WM5000P5,
    /**
     *厂家已有的其他设备类型（我们这边暂时没有开发）
     */
    WM5000L,
    /**
     *厂家已有的其他设备类型（我们这边暂时没有开发）
     */
    WMPEPLUS,
    /**
     *厂家已有的其他设备类型（我们这边暂时没有开发）
     */
    WM5000P6,
    /**
     *通知校验时间数据包
     */
    TIMING;

    public static boolean IsContain(String deviceSubType) {
        for (PatrolDeviceType deviceType : PatrolDeviceType.values()) {
            if (deviceType.toString().equals(deviceSubType)) {
                return true;
            }
        }
        return false;
    }
}
