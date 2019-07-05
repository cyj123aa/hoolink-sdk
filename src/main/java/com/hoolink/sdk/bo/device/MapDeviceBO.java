package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-07-05 10:50.
 * <p>
 * description:
 */
@Data
public class MapDeviceBO implements Serializable {
    private static final long serialVersionUID = 8130761288522711088L;

    private Long id;

    private String name;

    private BigDecimal[] lnglat;

    private Long style;

    private String typeName;

    /*** 设备安装地址 */
    private String installAddress;
}
