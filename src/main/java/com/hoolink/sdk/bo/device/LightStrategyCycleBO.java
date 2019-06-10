package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
public class LightStrategyCycleBO implements Serializable {

    private static final long serialVersionUID = -8513894556594050336L;

    /*** 策略ID */
    private Long LightStrategyId;

    /*** 周几 (1-7) */
    private Integer dayOfWeek;

    /*** 指定日期 */
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate specialDate;
}
