package com.hoolink.sdk.bo.device.req;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/14
 */
@Data
public class CreateLightStrategyBO implements Serializable {

    /*** 项目ID */
    @NotNull(message = "项目ID不允许为空")
    private Long projectId;

    /*** 策略名称 */
    @NotBlank(message = "策略名称不允许为空")
    private String name;

    /*** 策略描述 */
    @NotBlank(message = "策略描述不允许为空")
    private String description;

    /*** 策略模式 */
    @NotNull(message = "策略模式不允许为空")
    private Byte pattern;

    /*** 自定义 (周一到周日，对应 1-7) */
    private List<Byte> dayOfWeeks;

    /*** 特殊日期 */
    @JsonSerialize(contentUsing = LocalDateSerializer.class)
    @JsonDeserialize(contentUsing = LocalDateDeserializer.class)
    private List<LocalDate> specialDates;

    /*** 配置项 */
    @NotEmpty(message = "亮灯时间不允许为空")
    private List<CreateLightStrategyItemBO> items;

}
