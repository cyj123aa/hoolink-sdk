package com.hoolink.sdk.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author XuBaofeng.
 * @date 2019-02-27 22:39.
 * <p>
 * description: 设备工具类
 */
public class DeviceUtil {

    /**
     * 组装设备名称, 规则如下:
     * 灯杆编号 灯杆名称 【设备编号 设备名称】
     * -- 备注: 其中【设备编号 设备名称】中的设备编号和设备名称有就展示, 没有就不展示
     *
     * @param poleNo
     * @param poleName
     * @param deviceNo
     * @param deviceName
     * @return
     */
    public static String assemblyDeviceName(String poleNo, String poleName, String deviceNo, String deviceName) {
        StringBuffer sb = new StringBuffer();
        if (StringUtils.isNotBlank(poleNo)) {
            sb.append(poleNo);
        }
        if (StringUtils.isNotBlank(poleName)) {
            if (StringUtils.isNotBlank(poleNo)) {
                sb.append(" ");
            }
            sb.append(poleName);
        }
        if (StringUtils.isNotBlank(deviceNo) || StringUtils.isNotBlank(deviceName)) {
            Boolean flag = StringUtils.isNotBlank(poleNo) || StringUtils.isNotBlank(poleName);
            if (flag) {
                sb.append("【");
            }
            if (StringUtils.isNotBlank(deviceNo)) {
                sb.append(deviceNo);
            }
            if (StringUtils.isNotBlank(deviceName)) {
                if (StringUtils.isNotBlank(deviceNo)) {
                    sb.append(" ");
                }
                sb.append(deviceName);
            }
            if (flag) {
                sb.append("】");
            }
        }
        return sb.toString();
    }
}
