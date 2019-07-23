package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author XuBaofeng.
 * @date 2019-05-21 15:11.
 * <p>
 * description:
 */
@Data
public class DeviceTreeBO implements Serializable {
    private static final long serialVersionUID = 6953613166445933023L;
    /*** 每个节点的唯一标识 */
    private Long key;
    /*** 展示节点 */
    private String title;
    /*** 值 */
    private Long value;
    /*** 设备类型 */
    private Long type;
    /*** 经度 */
    private BigDecimal longitude;
    /*** 纬度 */
    private BigDecimal latitude;
    /*** 坐标系X轴 */
    private Integer x;
    /*** 坐标系Y轴 */
    private Integer y;
    /*** 坐标系Z轴 */
    private Integer z;

    /*** 设备状态 */
    private Integer status;

    /*** 安装地址 */
    private String installAddress;
    /*** 设备类型名 */
    private String typeName;

}
