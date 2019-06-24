package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-20 14:10
 * @Description
 */
@Data
public class ProgramPlayStatusBO implements Serializable {

    @JSONField(name="NodeNo")
    private Long nodeNo;
    @JSONField(name="ProgramNo")
    private String programNo;
    private Long programId;
    @JSONField(name="PlayState")
    private Integer playState;
}
