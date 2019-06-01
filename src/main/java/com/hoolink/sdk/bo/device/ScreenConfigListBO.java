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
 * @date 2019/5/28 16:40
 */
@Data
public class ScreenConfigListBO implements Serializable {
    private static final long serialVersionUID = 2806917045659468305L;
    
    /*** 清单ID */
    private Long id;

    /*** 项目表外键 */
    private Long projectId;

    /*** 显示屏播放清单的名字 */
    private String screenConfigName;

    /*** 清单亮度 */
    private Integer brightness;

    /*** 清单类型：1常规 2定时 */
    private Byte configType;

    /*** 定时开始时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingStart;

    /*** 定时结束时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingEnd;

    /*** 模式: 1.每天 2.自定义 3.特殊日期 */
    private Byte pattern;

    /*** 策略周期 */
    private List<ScreenStrategyCycleBO> strategyCycles;

    /*** 播放状态：1：正在播放， 2：停止 */
    private Integer playStatus;

    /*** 文件下发状态状态：0：下发中， 1：下发成功，2：下发失败 */
    private Integer sendStatus;

    /*** 清单开始时间 */
    private Long startTime;

    /*** 清单状态：false 禁用 true启用 */
    private Boolean configStatus;

    /*** 创建时间 */
    private Long created;

    /*** 修改时间 */
    private Long updated;

    /*** 距离策略开始间隔时间 */
    private Long intervalTime;

    /*** 清单已下发百分比 */
    private String sendPercent;
}
