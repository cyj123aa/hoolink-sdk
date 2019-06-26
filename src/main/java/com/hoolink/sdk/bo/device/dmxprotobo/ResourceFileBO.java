package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 10:28
 * @Description
 */
@Data
public class ResourceFileBO implements Serializable {
    @JSONField(name="FileName")
    private String fileName;
    @JSONField(name="ResName")
    private String resName;
    @JSONField(name="FileSize")
    private Float fileSize;
    @JSONField(name="ShareMode")
    private Integer shareMode;
    @JSONField(name="ResourceNo")
    private String resourceNo;
    @JSONField(name="UpLoadStatus")
    private Integer uploadStatus;
}
