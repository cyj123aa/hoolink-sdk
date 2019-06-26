package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 11:36
 * @Description
 */
@Data
public class BizReqHistoryGroupBO implements Serializable {

    /** 分组名称 */
    private String groupName;
    /** 设备数量 */
    private Integer deviceNum;
    /** 设备列表 */
    private List<BizReqDeviceManagerHistoryBO> bizReqDeviceHistoryBOList;
}
