package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-23 18:59.
 * <p>
 * description:
 */
@Data
public class GroupShuttleBoxBO implements Serializable {
    /*** 所有设备 */
    private List<DeviceTreeBO> allDevice;

    /*** 已选设备 */
    private List<DeviceTreeBO> beSelectDevice;
}
