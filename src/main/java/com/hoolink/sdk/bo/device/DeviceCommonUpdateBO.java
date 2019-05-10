package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangdong
 * @date 2019/4/28 15:35
 */
@Data
public class DeviceCommonUpdateBO implements Serializable {
    private static final long serialVersionUID = -6506449444626089502L;

    /*** 项目ID */
    private Long projectId;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 设备ID */
    private Long id;

    /*** 物理地址 */
    private String mac;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备地址 */
    private String installAddress;

    /*** 描述 */
    private String description;

    /*** 经度 */
    private BigDecimal longitude;

    /*** 纬度 */
    private BigDecimal latitude;

    /*** 所属集中器ID */
    private Long externalId;

    /*** 所属灯杆ID */
    private Long poleId;

    /*** 广播ID */
    private Long broadcastId;

    /*** IP地址 */
    private String ip;

    /*** 端口号 */
    private String port;

    /*** 模型编号 */
    private String modelNo;

}
