package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 11:34.
 * <p>
 * description:
 */
@Data
public class MonitorNodeBO implements Serializable {
    private static final long serialVersionUID = 590800442464938944L;

    private Long deviceId;

    private DeviceTypeEnum deviceType;
}
