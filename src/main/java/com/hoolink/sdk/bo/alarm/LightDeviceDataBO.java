package com.hoolink.sdk.bo.alarm;

import lombok.Data;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-10 17:48.
 * <p>
 * description:
 */
@Data
public class LightDeviceDataBO extends DeviceDataBO {

    private static final long serialVersionUID = -47675939663507389L;

    /*** ACK码 */
    private String ack;

    /*** 电压 */
    private Integer voltage;
}
