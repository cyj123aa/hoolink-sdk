package com.hoolink.sdk.bo.device.monitor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/30
 * @Desc
 */
@Data
public class WaterLevelHistoryBO implements Serializable {

    private static final long serialVersionUID = 8647736623213095317L;
    /** 环境传感器名称 */
    private String monitorName;

    /** 水尺水位值单位：m */
    private Float waterLevel;

    /** 创建时间*/
    private Long created;

}