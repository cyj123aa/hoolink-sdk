package com.hoolink.sdk.bo.device.req;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.hoolink.sdk.bo.device.DmxProgramStrategyCycleBO;
import com.hoolink.sdk.bo.device.ProjectParamBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 20:29
 * @Description
 */
@Data
public class DmxProgramBO extends ProjectParamBO implements Serializable {

    /*** 节目ID */
    private Long id;
    private String programNo;
    @NotEmpty(message = "节目名称不能为空")
    private String programName;

    /*** 播放方式： 0：单目循环，1：列表循环，2：随机播放，3：单次播放*/
    @NotEmpty(message = "播放方式不能为空")
    private Byte playStyle;

    /*** 节目类型 1:常规，2：定时 */
    private Byte programType;

    /*** 开始时间 */
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingStart;

    /*** 结束时间 */
    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingEnd;

    /*** 模式: 1.每天 2.自定义 3.特殊日期 */
    private Byte programMode;

    /*** 发布文件集合 */
    @NotEmpty(message = "发布文件不能为空")
    private List<DmxMediaFileBO> files;

    /*** 节点集合 */
    @NotEmpty(message = "下发节点不能为空")
    private List<DmxNodeSplitBO> nodes;

    /*** 节目周期 */
    private List<DmxProgramStrategyCycleBO> strategyCycles;

    /*** 播放状态：1：正在播放， 2：停止 */
    private Byte playStatus;

    /*** 文件下发状态状态：0：下发中， 1：下发成功，2：下发失败 */
    private Byte sendStatus;

    /*** 节目开始时间 */
    private Long startTime;

    /*** 节目开始到现在的时间 */
    private Long startToNowTime;

    /*** 定时任务的间隔时间（单位秒） */
    private Long secondInterval;
}
