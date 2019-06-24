package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 16:42
 * @Description
 */
@Data
public class ProgramCreateDataBO extends TargetBO implements Serializable {
    @JSONField(name="ProgramNo")
    private String programNo;
    @JSONField(name="ProgramName")
    private String programName;
    @JSONField(name="ResourceNo")
    private String resourceNo;
    @JSONField(name="Scenes")
    private List<ProgramSceneBO> scenes;
}
