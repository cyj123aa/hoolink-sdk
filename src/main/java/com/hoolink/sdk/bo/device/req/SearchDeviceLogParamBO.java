package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zhuli
 * @date 2019/7/11
 */
@Data
public class SearchDeviceLogParamBO extends PageParam implements Serializable {

    private static final long serialVersionUID = -3625402078704927611L;
    /*** 设备ID */
    @NotNull
    private Long deviceId;

    /*** 开始时间 */
    private String beginTime;

    /*** 结束时间 */
    private String endTime;

}
