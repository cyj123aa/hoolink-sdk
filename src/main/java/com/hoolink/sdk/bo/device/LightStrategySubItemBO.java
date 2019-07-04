package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
public class LightStrategySubItemBO implements Serializable {

    private static final long serialVersionUID = -7685190017820308459L;

    /*** 调光值 */
    private Integer dimmingValue;

    /*** 设备 */
    private List<Long> deviceIds;

    /*** 设备名称 */
    private List<String> deviceNames;

    /*** 设备ID和冲突状态 */
    private List<StatusBO> deviceIdStatuses;

}
