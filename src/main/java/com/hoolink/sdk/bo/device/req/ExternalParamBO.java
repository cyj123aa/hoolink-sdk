package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;
import java.util.List;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-24 14:27
 * @Description
 */
@Data
public class ExternalParamBO extends PageParam implements Serializable {

    /*** 设备名称 */
    private String deviceName;
    /*** 公司ID列表 */
    private List<Long> projectIds;
    /*** 变更状态 */
    private Byte changeStatus;
}
