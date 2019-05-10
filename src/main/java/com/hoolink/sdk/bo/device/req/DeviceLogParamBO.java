package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/26 13:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceLogParamBO extends PageParam implements Serializable {
    private static final long serialVersionUID = 8389083909655155765L;

    /*** 设备ID */
    @NotNull
    private Long deviceId;

    /*** 开始时间 */
    private Long beginTime;

    /*** 结束时间 */
    private Long endTime;
}
