package com.hoolink.sdk.bo.device.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author wangdong
 * @date 2019/5/21 10:28
 */
@Data
public class ScreenStrategyCycleBO implements Serializable {
    private static final long serialVersionUID = 2507981248739543576L;

    /*** 周几 1-7 */
    private Byte dayOfWeek;

    /*** 特殊日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate specialDate;
}
