package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.util.List;

/**
 * @Author: tonghao
 * @Date: 2019/7/17 18:47
 */
@Data
public class SearchDeviceManageParamBO {

    /** 设备mac */
    private String mac;

    /** 设备类型id */
    private Long deviceSubType;
}
