package com.hoolink.sdk.bo.device;

import java.util.List;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class DeviceMaintainBO {

    /**
     * 设备id集合
     */
 private List<Long> deviceIds;
    /**
     * 工单状态
     */
 private Boolean  workStatus;
}
