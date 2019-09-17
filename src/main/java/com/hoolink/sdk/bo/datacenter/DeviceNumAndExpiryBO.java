package com.hoolink.sdk.bo.datacenter;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-08-27 16:04
 * @Description
 */
@Data
public class DeviceNumAndExpiryBO implements Serializable {

    /*** 设备类型（与deviceType对应） */
    private Long deviceType;

    /*** 设备类型名称（与设备类型对应） */
    private String deviceTypeName;

    /*** 设备数量 */
    private Long deviceNum;

    /*** 设备在保数量 */
    private Long underWarrantyNum;

    /*** 设备过保数量 */
    private Long overWarrantyNum;

    /*** 在保百分比值 */
    private Double underWarrantyPercent;

}
