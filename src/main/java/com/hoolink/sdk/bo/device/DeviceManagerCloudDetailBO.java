package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author xiaolei.yang.
 * @date 2019-04-01 9:07.
 * <p>
 * description:
 */
@Data
public class DeviceManagerCloudDetailBO implements Serializable {
    private static final long serialVersionUID = -4294674614950483443L;

    /*** 设备主键ID */
    private Long id;

    /*** 设备名称 */
    private String deviceName;

    /*** 项目ID */
    private Long projectId;

    /*** 灯杆ID */
    private Long poleId;

    /*** 设备类型 */
    private Long deviceTypeId;

    /*** 设备类型名 */
    private String typeName;

    /*** 设备型号 */
    private Long deviceSubTypeId;

    /*** 型号名称 */
    private String subTypeName;

    /*** 模型编号 */
    private String modelNo;

    /*** 经度 */
    private BigDecimal longitude;

    /*** 纬度 */
    private BigDecimal latitude;

    /*** 异常状态 */
    private Boolean alarmStatus;

    /*** 描述 */
    private String description;

    /*** 坐标系X轴 */
    private Integer x;

    /*** 坐标系Y轴 */
    private Integer y;

    /*** 坐标系Z轴 */
    private Integer z;

    /*** 运行状态 */
    private Boolean runStatus;

    /*** 安装地址 */
    private String installAddress;

    /*** 在线状态 */
    private Boolean onlineStatus;

    /*** 工作状态 */
    private Boolean workStatus;

    private String imgPath;

    /**
     * 调光值
     */
    private Integer dimmingValue;

    /**
     * 亮度
     */
    private Integer brightness;

    /**
     * 音量
     */
    private Integer volume;

    /**
     * 最后一次通讯时间
     */
    private Long lastDateTime;

    private Integer deviceStatus;

}
