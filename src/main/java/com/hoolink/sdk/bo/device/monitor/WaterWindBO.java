package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/17
 * @Desc
 */
@Data
public class WaterWindBO implements Serializable {
    private static final long serialVersionUID = 4347940532073993448L;

    /** 风向*/
    private String windDirection;

    /** 风速*/
    private String windSpeed;

    /** 风力等级*/
    private Integer windLevel;

    /** 水位 */
    private String waterLevel;

    /** 时间 */
    private Long time;
}
