package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-25 17:11
 * @Description
 */
@Data
public class ExternalSyncingBO implements Serializable {
    private String externalName;
    private Long externalId;
    private Byte syncStatus;
    private Byte onlineStatus;
}
