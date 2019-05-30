package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * @author XuBaofeng.
 * @date 2019-05-18 16:56.
 * <p>
 * description:
 */
@Data
public class LightStrategyDownBO implements Serializable {
    private static final long serialVersionUID = 6693182459923389829L;

    /*** 设备ID */
    private Long lightId;

    /*** 单灯物理地址 */
    private String lightMac;

    /*** 调光值 */
    private Integer dimmingValue;

    /*** 开始时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime startTime;

    /*** 结束时间 */
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime endTime;

    /*** 集中器物理地址 */
    private Long externalId;

    /*** 集中器物理地址 */
    private String externalMac;

}
