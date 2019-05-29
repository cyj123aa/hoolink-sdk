package com.hoolink.sdk.bo.device.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/21 10:13
 */
@Data
public class ScreenPlayConfigBO implements Serializable {
    private static final long serialVersionUID = -5475285894907996876L;

    /*** 清单ID */
    private Long id;

    /*** 项目表外键 */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /*** 显示屏播放清单的名字 */
    @NotNull(message = "清单名称不能为空")
    private String screenConfigName;

    /*** 描述 */
    private String description;

    /*** 清单亮度 */
    @NotNull(message = "屏幕亮度不能为空")
    private Integer brightness;

    /*** 清单类型：1常规 2定时 */
    @NotNull(message = "清单类型不能为空")
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

    /*** 显示屏ID集合 */
    @NotEmpty(message = "发布设备不能为空")
    private List<Long> screenIds;

    /*** 发布文件集合 */
    @NotEmpty(message = "发布文件不能为空")
    private List<DeviceFileTypeBO> files;

    /*** 清单生成的lst文件ID */
    private Long obsId;

    /*** 文件下发状态状态：0：下发中， 1：下发成功，2：下发失败 */
    private Byte sendStatus;

    /*** 下行的播放清单名称：格式为play001.lst-play100.lst' */
    private String innerName;

    /*** 播放文件序号，与inner_name相对应 */
    private Integer playIndex;
}
