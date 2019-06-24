package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-05 20:21
 * @Description
 */
@Data
public class ProgramPlayBO implements Serializable {
    @JSONField(name="PlayType")
    private Integer playType;
    @JSONField(name="PlaySpeed")
    private Integer playSpeed;
    @JSONField(name="PlayMode")
    private Integer playMode;
    @JSONField(name="PlayStartDate")
    private String playStartDate;
    @JSONField(name="PlayEndDate")
    private String playEndDate;
    @JSONField(name="PlayWeek")
    private List<Integer> playWeek;
    @JSONField(name="PlayStartTime")
    private String playStartTime;
    @JSONField(name="PlayEndTime")
    private String playEndTime;
    @JSONField(name="Targets")
    private List<TargetProgramBO> targets;
}
