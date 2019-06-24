package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-12 11:12
 * @Description
 */
@Data
public class DmxProgramConflictBO implements Serializable {

    /*** 节目ID */
    private Long programId;

    /*** 节目名称 */
    private String programName;

    /*** 节目模式: 1.每天 2.自定义 3.特殊日期 */
    private Byte playMode;

    /*** 节目周期 */
    private List<DmxProgramStrategyCycleBO> strategyCycles;

    /*** 节目开始时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingStart;

    /*** 节目结束时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingEnd;
}
