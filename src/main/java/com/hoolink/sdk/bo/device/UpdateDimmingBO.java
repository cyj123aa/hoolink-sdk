package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/5/17
 * @Desc
 */
@Data
public class UpdateDimmingBO {

    /** 设备id */
    private List<Long> ids;

    /** 设备mac */
    private String mac;

    /**设备型号id */
    private Long deviceSubTypeId;

    /** 调光值 */
    private Integer dimmingValue;
}
