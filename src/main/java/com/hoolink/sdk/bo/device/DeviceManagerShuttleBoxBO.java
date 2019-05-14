package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-13 18:03.
 * <p>
 * description:
 */
@Data
public class DeviceManagerShuttleBoxBO implements Serializable {
    private static final long serialVersionUID = -2679322771154711916L;

    /*** 设备名称 */
    private String title;

    /*** 设备ID */
    private Long value;

    /*** 设备ID */
    private Long key;

    /*** 设备类型 */
    private Long type;
}
