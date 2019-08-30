package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
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
    @NotNull(message = "设备类型不能为空")
    private Long deviceTypeId;

    /*** 设备ID */
    @NotNull(message = "设备ID不能为空")
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
    private String cameraIp;

    /*** 端口号 */
    private String cameraPort;

    /*** 设备验证码     */
    private String validateCode;

    /*** 模型编号 */
    private String modelNo;

    /*** 模型x轴值 */
    private Integer x;

    /*** 模型y轴值 */
    private Integer y;

    /*** 模型z轴值 */
    private Integer z;

    /*** 所属NVR */
    private Long nvrId;
}
