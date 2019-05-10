package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author XuBaofeng.
 * @date 2019-04-01 19:24.
 * <p>
 * description:
 */
@Data
public class ExternalBO extends DeviceManagerBO {
    private static final long serialVersionUID = -4455609410790779959L;

    /*** 设备ID */
    private Long id;
    /*** 通讯号 */
    private String channelNo;
}
