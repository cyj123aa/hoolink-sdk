package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-05-14 17:49.
 * <p>
 * description:
 */
@Data
public class DeviceInfoBO implements Serializable {
    private static final long serialVersionUID = 913360014621756256L;

    /*** 设备ID */
    private Long id;

    /*** 设备序列号 */
    private String deviceNo;

    /*** 设备类型 */
    private String typeName;

    /*** 设备型号 */
    private String subTypeName;

    /*** 设备版本 */
    private String version;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备安装地址 */
    private String installAddress;

    /*** 设备描述 */
    private String description;

    /*** 设备所属分组 */
    private Long groupId;

    /*** 设备所有分组 */
    private List<GroupBO> groups;

    /*** 项目ID */
    private Long projectId;

    /*** 3D模型坐标 */
    private Integer x;
    private Integer y;
    private Integer z;

    /*** 经纬度坐标 */
    private BigDecimal longitude;
    private BigDecimal latitude;
}
