package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/4/23 13:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListDeviceParamBO extends PageParam implements Serializable {
    private static final long serialVersionUID = 8807072304460764575L;

    /*** 设备编号 */
    private String deviceNo;

    /*** 设备名称 */
    private String deviceName;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 设备型号ID */
    private Long deviceSubTypeId;

    /*** 设备状态 */
    private Byte deviceStatus;

    /*** 项目ID列表 */
    private List<Long> projectIds;
}
