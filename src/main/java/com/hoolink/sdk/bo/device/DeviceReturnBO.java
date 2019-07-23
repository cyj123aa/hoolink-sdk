package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/23 13:29
 */
@Data
public class DeviceReturnBO implements Serializable {
    private static final long serialVersionUID = -2442650769200128799L;

    /*** 设备ID */
    private Long id;

    /*** 设备编号 */
    private String deviceNo;

    /*** 物理地址 */
    private String mac;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 设备类型名称 */
    private String typeName;

    /*** 设备型号名称 */
    private String subTypeName;

    /*** 项目ID */
    private Long projectId;

    /*** 设备状态 */
    private String deviceStatus;
    
    /*** 版本信息 */
    private String versionName;

    /*** 创建时间 */
    private Long created;

    /*** 安装地址 */
    private String installAddress;

    /*** 分组ID */
    private Long groupId;

    /*** 分组名称 */
    private String groupName;


}
