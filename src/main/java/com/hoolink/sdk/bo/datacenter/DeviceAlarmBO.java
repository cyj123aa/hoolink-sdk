package com.hoolink.sdk.bo.datacenter;

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
 * @DateTime 2019-08-29 19:23
 * @Description
 */
@Data
public class DeviceAlarmBO {

    /*** 项目ID */
    private Long projectId;

    /*** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1988-08-08")
    private LocalDate countDate;

    /*** 告警次数 */
    private Long alarmNum;

    /*** 统计时间（时间戳） */
    private Long creator;

    /*** 创建者（默认为0：系统） */
    private Long created;
}
