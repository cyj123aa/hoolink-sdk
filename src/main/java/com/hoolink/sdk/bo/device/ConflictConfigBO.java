package com.hoolink.sdk.bo.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-30 15:30.
 * <p>
 * description:
 */
@Data
public class ConflictConfigBO implements Serializable {
    private static final long serialVersionUID = -3678880549893927748L;

    /*** 清单ID */
    private Long configId;

    /*** 清单名称 */
    private String configName;

    /*** 清单模式: 1.每天 2.自定义 3.特殊日期 */
    private Byte pattern;

    /*** 特殊日期 */
    @ApiModelProperty(dataType = "[Ljava.lang.String;")
    @JsonSerialize(contentUsing = LocalDateSerializer.class)
    @JsonDeserialize(contentUsing = LocalDateDeserializer.class)
    private List<LocalDate> dates;

    /*** 自定义周 */
    private List<Byte> weeks;

    /*** 清单开始时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingStart;

    /*** 清单结束时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    @JsonSerialize(using = LocalTimeSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "06:08:00")
    private LocalTime timingEnd;

    private Byte week;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @ApiModelProperty(dataType = "java.lang.String", example = "1970-01-01")
    private LocalDate specialDate;

    /**
     * 播放状态：1：正在播放， 2：停止
     * 表字段 : screen_play_config.play_status
     */
    private Integer playStatus;
}
