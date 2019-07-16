package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaolei.yang..
 * @date 2019-05-14 17:38.
 * <p>
 * description:
 */
@Data
public class DeviceCloudBO implements Serializable {
    private static final long serialVersionUID = 8136021842994989560L;

    /*** 设备ID */
    private Long id;

    /*** 设备类型 */
    private Long typeId;

    private String typeName;

    /*** 设备型号 */
    private Long subTypeId;

    /*** 设备型号 */
    private String subTypeName;

    private String modelNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备安装地址 */
    private String installAddress;

    /*** 项目ID */
    private Long projectId;

    private Boolean alarmStatus;
    private Boolean onlineStatus;
    private Boolean workStatus;
    private Boolean runStatus;

    private Integer deviceStatus;

    /*** 3D模型坐标 */
    private Integer x;
    private Integer y;
    private Integer z;

    private Integer dimmingValue;

    /*** 经纬度坐标 */
    private BigDecimal longitude;
    private BigDecimal latitude;
}
