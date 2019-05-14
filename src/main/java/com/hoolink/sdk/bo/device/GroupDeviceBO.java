package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-05-13 19:01.
 * <p>
 * description:
 */
@Data
public class GroupDeviceBO implements Serializable {
    private static final long serialVersionUID = -2108036869636596276L;

    /*** 项目下所有的设备 */
    private List<DeviceManagerShuttleBoxBO> allDeviceManager;

    /*** 该分组已选的设备 */
    private List<DeviceManagerShuttleBoxBO> beSelectDeviceManager;
}
