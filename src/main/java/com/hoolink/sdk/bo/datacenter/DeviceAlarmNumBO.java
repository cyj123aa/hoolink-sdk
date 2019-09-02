package com.hoolink.sdk.bo.datacenter;

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
 * @DateTime 2019-08-27 17:39
 * @Description
 */
@Data
public class DeviceAlarmNumBO implements Serializable {

    /*** 告警次数 */
    private Long alarmNum;

    /*** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1988-08-08")
    private LocalDate countDate;
}
