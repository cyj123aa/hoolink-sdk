package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 17:17
 * @Description
 */
@Data
public class DmxProgramStrategyCycleBO implements Serializable {

    /*** 周几 1-7 */
    private Byte weekDay;

    /*** 特殊开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate startDate;

    /*** 特殊结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate endDate;
}
