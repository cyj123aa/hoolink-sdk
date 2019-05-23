package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-23 20:30.
 * <p>
 * description:
 */
@Data
public class BeSelectDeviceBO implements Serializable {

    private Long id;

    private String deviceNo;

    private String deviceName;

    private String installAddress;

    private String typeName;
}
