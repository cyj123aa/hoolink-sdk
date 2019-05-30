package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-23 17:34.
 * <p>
 * description:
 */
@Data
public class DeviceLogInfoBO implements Serializable {

    /*** 设备ID */
    private Long deviceId;

    /*** 设备序列号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 类型 */
    private String typeName;

    /*** 型号 */
    private String subTypeName;

    /*** 分组 */
    private String groupName;

    /*** 项目 */
    private Long projectId;

    private Boolean alarmStatus;
    private Boolean runStatus;
    private Boolean workStatus;
    private Boolean onlineStatus;

    /*** 状态 */
    private String status;

    /*** 版本 */
    private String versionName;

    /*** 安装地址 */
    private String installAddress;

    /*** 创建时间 */
    private Long created;
}
