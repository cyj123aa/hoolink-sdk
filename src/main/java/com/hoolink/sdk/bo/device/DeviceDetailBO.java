package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangdong
 * @date 2019/4/28 17:31
 */
@Data
public class DeviceDetailBO implements Serializable {
    private static final long serialVersionUID = 5081638647442048497L;

    /*** 设备ID */
    private Long id;

    /*** 序列号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 物理地址 */
    private String mac;

    /*** 项目ID */
    private Long projectId;

    /*** 灯杆ID(为0时表示独立自设备) */
    private Long poleId;

    /*** 设备型号ID */
    private Long deviceSubTypeId;

    /*** 设备型号名称 */
    private String subTypeName;

    /*** 设备类型名称 */
    private String typeName;

    /*** 模型编号 */
    private String modelNo;

    /*** 经度 */
    private BigDecimal longitude;

    /*** 纬度 */
    private BigDecimal latitude;

    /*** 描述 */
    private String description;

    /*** 安装地址 */
    private String installAddress;

    /*** 版本号 */
    private Long versionId;

    /*** 所属集中器ID */
    private Long externalId;

    /*** 广播ID */
    private Long broadcastId;

    /*** IP地址 */
    private String ip;

    /*** 端口号 */
    private String port;

    /*** 验证码 */
    private String validateCode;

    /*** 版本信息 */
    private String versionName;

    /*** 分组ID */
    private Long groupId;

    /*** 分组名称 */
    private String groupName;

    /*** 模组编号 */
    private String verifyCode;
    
}
