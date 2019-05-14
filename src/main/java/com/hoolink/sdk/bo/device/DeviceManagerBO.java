package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author XuBaofeng.
 * @date 2019-04-01 9:07.
 * <p>
 * description:
 */
@Data
public class DeviceManagerBO implements Serializable {
    private static final long serialVersionUID = -4294674614950483443L;

    /*** 设备主键ID */
    private Long id;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 物理地址 */
    private String mac;

    /*** 出厂时间 */
    private Long factoryTime;

    /*** 维保年限 */
    private Short maintainTime;

    /*** 项目ID */
    private Long projectId;

    /*** 责任组ID */
    private Long baseAreaId;

    /*** 灯杆ID */
    private Long poleId;

    /*** 设备类型 */
    private Long deviceTypeId;

    /*** 设备型号 */
    private Long deviceSubTypeId;

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

    /*** 版本号 */
    private Long versionId;
    /*** 版本号 */
    private String versionName;

    /*** 型号名称 */
    private String subTypeName;

    /*** 设备类型名 */
    private String typeName;

    /*** 在线状态 */
    private Boolean onlineStatus;

    /*** 工作状态 */
    private Boolean workStatus;

    /*** 操作类型 1 增加，2修改*/
    private String operate;

    /** 分组Id */
    private Long groupId;

    /** 分组名称 */
    private String groupName;
}
