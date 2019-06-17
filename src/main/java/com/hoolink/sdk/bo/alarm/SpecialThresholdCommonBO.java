package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/12 11:17
 */
@Data
public class SpecialThresholdCommonBO implements Serializable {

    private static final long serialVersionUID = 2905961044431159521L;
    /*** 特殊阈值记录ID */
    private Long configId;

    /*** 设备类型ID */
    private Long deviceType;

    /*** 项目ID */
    private Long projectId;
}
