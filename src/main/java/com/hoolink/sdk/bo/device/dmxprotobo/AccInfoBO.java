package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-04 16:42
 * @Description
 */
@Data
public class AccInfoBO implements Serializable {
    @JSONField(name="LoginName")
    private String loginName;
    @JSONField(name="Password")
    private String password;
}
