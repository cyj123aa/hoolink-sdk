package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-14 14:18.
 * <p>
 * description:
 */
@Data
public class PageDeviceManagerBO implements Serializable {
    private static final long serialVersionUID = -5201964926453736832L;

    /*** 设备ID */
    private Long id;
    /*** 设备编号 */
    private String deviceNo;
    /*** 设备名称 */
    private String deviceName;
    /*** 设备安装地址 */
    private String installAddress;
    /*** 设备创建时间 */
    private Long created;
    /*** 设备告警状态 */
    private Boolean alarmStatus;
    /*** 设备在线状态 */
    private Boolean onlineStatus;
    /*** 设备维修状态 */
    private Boolean workStatus;
    /*** 设备运行状态 */
    private Boolean runStatus;

    private String status;

    /*** 设备类型ID */
    private Long typeId;
    /*** 设备类型名称 */
    private String typeName;

    /*** 设备类型ID */
    private Long subTypeId;
    /*** 设备型号名称 */
    private String subTypeName;

    /*** 设备版本ID */
    private Long versionId;
    /*** 设备版本名称 */
    private String version;

    /*** 设备分组ID */
    private Long groupId;
    /*** 设备分组名称 */
    private String groupName;
}
