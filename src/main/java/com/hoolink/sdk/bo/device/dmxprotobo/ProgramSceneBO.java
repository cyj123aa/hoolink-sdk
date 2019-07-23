package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 16:05
 * @Description
 */
@Data
public class ProgramSceneBO implements Serializable {
    @JSONField(name="NodeNo")
    private String nodeNo;
    @JSONField(name="xPos")
    private  Integer xPos;
    @JSONField(name="yPos")
    private Integer yPos;
    @JSONField(name="Width")
    private Integer width;
    @JSONField(name="Height")
    private Integer height;
}
