package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
public class LightStrategyBO implements Serializable {

    private static final long serialVersionUID = -482159689763846931L;

    /*** 主键 */
    private Long id;
    /*** 项目ID */
    private Long projectId;
    /*** 名称 */
    private String name;
    /*** 描述 */
    private String description;
    /*** 重复模式 */
    private Byte pattern;
    /*** 策略状态 */
    private Boolean status;

    /*** 自定义 (周一到周日，对应 1-7) */
    private List<Byte> dayOfWeeks;

    /*** 特殊日期 */
    @JsonSerialize(contentUsing = LocalDateSerializer.class)
    @JsonDeserialize(contentUsing = LocalDateDeserializer.class)
    private List<LocalDate> specialDates;

    /*** 策略项，按时间维度分 */
    private List<LightStrategyItemBO> items;

    /*** 冲突状态 */
    private Boolean hasConflict;

    /*** 已选设备 */
    private List<GroupTreeBO> selectedDevice;
}
