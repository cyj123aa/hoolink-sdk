package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-05 19:40
 * @Description
 */
@Data
public class TargetNoListBO implements Serializable {
    @JSONField(name="Targets")
    private List<String> targets;
}
