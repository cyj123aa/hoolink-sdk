package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
public class LightStrategyItemBO implements Serializable {

    private static final long serialVersionUID = 4100346559065181595L;

    /*** 主键 */
    private Long id;

    /*** 策略ID */
    private Long lightStrategyId;

    /*** 开始时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime startTime;

    /*** 结束时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime endTime;

    /*** 策略项子项 (调光值、设备) */
    private List<LightStrategySubItemBO> subItems;

    /*** 冲突状态 */
    private Boolean status;
}
