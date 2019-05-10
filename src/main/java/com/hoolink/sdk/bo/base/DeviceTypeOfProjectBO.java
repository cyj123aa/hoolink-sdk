package com.hoolink.sdk.bo.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/18 13:05
 */
@Data
public class DeviceTypeOfProjectBO implements Serializable {
    private static final long serialVersionUID = -2682352682159566446L;

    /*** 主键 */
    private Long id;

    /*** 对应项目id */
    private Long projectId;

    /*** 设备类型ID */
    private Long deviceSubTypeId;

    /*** 维保年限 */
    private Short maintainTime;
}
