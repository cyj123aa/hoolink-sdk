package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/4/26 16:17
 */
@Data
public class UpgradeHistoryParamBO implements Serializable {

    private static final long serialVersionUID = -8549660194609573550L;

    /** 项目id列表 */
    private List<Long> projectIds;

    /** 设备类型id */
    private Long deviceTypeId;

    /** 设备型号id */
    private Long deviceSubTypeId;

    /** 设备固件版本id */
    private Long versionId;
}
