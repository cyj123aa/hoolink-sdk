package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 09:45
 * @Description
 */
@Data
public class TargetListBO implements Serializable {

    @JSONField(name="Targets")
    private List<TargetBO> targets;
}
