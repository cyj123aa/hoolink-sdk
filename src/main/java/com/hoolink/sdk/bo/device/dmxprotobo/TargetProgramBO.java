package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-19 15:15
 * @Description
 */
@Data
public class TargetProgramBO extends TargetBO implements Serializable {
    @JSONField(name="ProgramNo")
    private String programNo;
    @JSONField(name="ProgramName")
    private String programName;
}
