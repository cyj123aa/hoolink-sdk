package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-04-03 17:06.
 * <p>
 * description:
 */
@Data
public class DevicePageAndLikeBO extends PageParamBO implements Serializable {
    private static final long serialVersionUID = 4772925919910671039L;

    /*** 项目ID */
    private Long projectId;

    /*** 责任组 */
    private Long areaId;

    /*** 设备类型 */
    private Long deviceTypeId;

    /*** 设备名称 */
    private String deviceName;

}
