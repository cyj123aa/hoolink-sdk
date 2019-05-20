package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName MediaTaskConflictDeviceBO
 * @Author huyaxi
 * @DATE 2019/5/17 20:28
 */
@Data
public class MediaTaskConflictDeviceBO implements Serializable {
    private Boolean conflict;
    private Long deviceId;
}
