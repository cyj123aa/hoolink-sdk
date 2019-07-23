package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-05 19:37
 * @Description
 */
@Data
public class TargetBO implements Serializable {
    @JSONField(name="Target")
    private Integer target;
    @JSONField(name="TargetNO")
    private Long targetNO;
}
