package com.hoolink.sdk.bo.smart;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 朱礼
 * @Date 2019/8/7
 * @Desc
 */
@Data
public class AreaBO implements Serializable {
    private static final long serialVersionUID = -8104985268655293242L;
    /** 主键 */
    private Long id;

    /** 区域名称 */
    private String areaName;

    /** 经度 */
    private BigDecimal longitude;

    /** 纬度 */
    private BigDecimal latitude;

    /** 坐标系X轴 */
    private Integer x;

    /** 坐标系Y轴 */
    private Integer y;

    /** 坐标系Z轴 */
    private Integer z;

    /** 是否启用(1:启用, 0:禁用) */
    private Boolean enabled;

    /** 项目Id */
    private Long projectId;

    /** 创建者 */
    private Long creator;

    /** 创建时间 */
    private Long created;

    /** 更新者 */
    private Long updator;

    /** 更新时间 */
    private Long updated;

}