package com.hoolink.sdk.bo.device.req;

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
 * @DateTime 2019-06-12 11:09
 * @Description
 */
@Data
public class DmxProgramConflictParamBO extends ProjectParamBO implements Serializable {

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

    /*** 节目周期 */
    private List<DmxProgramStrategyCycleBO> strategyCycles;

    /*** 分割节点 */
    private List<DmxNodeSplitBO> nodeList;
}
