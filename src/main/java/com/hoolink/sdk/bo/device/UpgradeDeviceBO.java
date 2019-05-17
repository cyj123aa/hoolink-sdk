package com.hoolink.sdk.bo.device;


import lombok.Data;

import java.io.Serializable;

/**
 * @author : chenzb
 * @Description : 设备升级匹配列表BO
 * @date : Created on 2019/4/23 13:14
 */

@Data
public class UpgradeDeviceBO implements Serializable {

    /*** 设备主键ID */
    private Long deviceId;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 物理地址 */
    private String deviceMac;

    /*** 项目ID */
    private Long projectId;

    /*** 项目编号 */
    private Long projectNo;

    /*** 设备类型 */
    private Long deviceTypeId;

    /*** 设备型号 */
    private Long deviceSubTypeId;
    /*** 设备型号名称 */
    private String deviceSubTypeName;

    /*** 设备版本号 */
    private Long deviceVersion;
}
