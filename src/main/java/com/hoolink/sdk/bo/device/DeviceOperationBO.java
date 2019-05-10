package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhuli
 * @date 2018/12/29
 * @desc
 */
@Data
public class DeviceOperationBO {
    private Long userId;
    private Long bizId;
    private Integer total;
    private Integer failCount;
    private Integer successCount;
    private Integer cmdResult;
    private Integer dimmingValue;

}
