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
 * @DateTime 2019-08-28 18:16
 * @Description
 */
@Data
public class DateNumBO  implements Serializable {

    /*** 统计的数量 */
    private Long countNum;

    /*** 统计的日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1988-08-08")
    private LocalDate countDate;

    /*** 项目ID */
    private Long projectId;

}
