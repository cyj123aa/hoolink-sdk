package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.hoolink.sdk.bo.device.req.ScreenStrategyCycleBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/30 11:28
 */
@Data
public class ScreenConfigDetailBO implements Serializable {
    private static final long serialVersionUID = -273110264435087614L;
    
    /*** 清单ID */
    private Long id;

    /*** 清单名称 */
    private String screenConfigName;

    /*** 清单描述 */
    private String description;

    /*** 清单类型：1常规 2定时 */
    private Byte configType;

    /*** 定时开始时间 */
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingStart;

    /*** 定时结束时间 */
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingEnd;

    /*** 模式: 1.每天 2.自定义 3.特殊日期 */
    private Byte pattern;

    /*** 策略周期 */
    private List<ScreenStrategyCycleBO> screenStrategyCycles;

    /*** 清单亮度 */
    private Integer brightness;

    /*** 显示屏穿梭框 */
    private DeviceShuttleBoxBO deviceShuttleBox;

    /*** 文件穿梭框 */
    private ScreenFileShuttleBoxBO fileShuttleBox;
}
