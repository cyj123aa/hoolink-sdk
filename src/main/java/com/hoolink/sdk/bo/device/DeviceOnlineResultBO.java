package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-08 19:07.
 * <p>
 * description: 设备登录时, 当登陆成功后, 给command返回的数据
 */
@Data
public class DeviceOnlineResultBO implements Serializable {
    private static final long serialVersionUID = -8903453276886706371L;
    /*** 集中器\监控器 ID */
    private Long deviceId;
    /*** 集中器\监控器 MAC地址 */
    private String deviceMac;
    /*** 设备类型 */
    private DeviceTypeEnum deviceTypeEnum;
    /*** 父节点ID */
    private Long parentId;
    /*** 当前设备所属项目 */
    private Long projectId;
    /*** 集中器\监控器 下所属子节点 */
    private List<NodeOnlineResultBO> nodes;

}
