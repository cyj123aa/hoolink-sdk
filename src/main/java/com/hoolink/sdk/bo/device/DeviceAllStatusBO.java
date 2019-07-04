package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 10:24.
 * <p>
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceAllStatusBO implements Serializable {
    private static final long serialVersionUID = 1747580323952075416L;

    private Long poleId;

    private Boolean runStatus;

    private Boolean alarmStatus;

    private Boolean onlineStatus;

    private Boolean workStatus;

}
