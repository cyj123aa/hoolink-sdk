package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-08 19:07.
 * <p>
 * description:
 */
@Data
public class NodeOnlineResultBO implements Serializable {
    private static final long serialVersionUID = 3650514442325751541L;
    /*** 设备ID */
    private Long nodeId;
    /*** 设备MAC地址 */
    private String nodeMac;
    /*** 设备类型 */
    private DeviceTypeEnum deviceTypeEnum;

}
