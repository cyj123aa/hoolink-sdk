package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/6/19 10:06
 * @desc
 **/
@Data
public class TodayLightStrategyItemBO {

    /*** 策略ID */
    private Long strategyItemId;

    /*** 开始时间 只包含时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime startTime;

    /*** 结束时间 只包含时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime endTime;

    /*** 策略名称 */
    private String strategyName;

    /*** 重复模式 1.每天 2.自定义 3.特殊日期 */
    private Byte pattern;

    /*** 自定义 (周一到周日，对应 1-7) */
    private List<Integer> dayOfWeeks;

    /*** 特殊日期 */
    @JsonSerialize(contentUsing = LocalDateSerializer.class)
    @JsonDeserialize(contentUsing = LocalDateDeserializer.class)
    private List<LocalDate> specialDates;

    /*** 设备 */
    private List<Long> deviceIds;

    /*** 开始日期和时间 包含日期和时间 */
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime startDateTime;

    /*** 结束日期和时间 包含日期和时间 */
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime endDateTime;
}
