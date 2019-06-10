package com.hoolink.sdk.bo.device.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.hoolink.sdk.param.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author wangdong
 * @date 2019/4/26 13:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceLogParamBO extends PageParam implements Serializable {
    private static final long serialVersionUID = 8389083909655155765L;

    /*** 设备ID */
    @NotNull
    private Long deviceId;

    /*** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate beginTime;

    /*** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate endTime;
}
