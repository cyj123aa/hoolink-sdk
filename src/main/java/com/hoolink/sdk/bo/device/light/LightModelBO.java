package com.hoolink.sdk.bo.device.light;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhangxin
 * @date 2019/6/28
 */
@Data
public class LightModelBO implements Serializable {

    private static final long serialVersionUID = 7131412398927854965L;

    /*** 设备ID */
    private Long id;
    /*** 设备名称 */
    private String deviceName;
    /*** 设备类型 */
    private Long typeId;
    /*** 坐标X */
    private Integer x;
    /*** 坐标Y */
    private Integer y;
    /*** 坐标Z */
    private Integer z;
    /*** 经度 */
    private BigDecimal latitude;
    /*** 维度 */
    private BigDecimal longitude;
    /*** 调光值 */
    private Integer dimmingValue;
}
