package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/28 17:00
 */
@Data
public class ScreenCommonParamBO implements Serializable {
    private static final long serialVersionUID = -3289657763214418159L;
    
    /*** 项目ID */
    private Long projectId;

    /*** 设备名称 */
    private String screenName;

    /*** 分组ID */
    private Long groupId;

    /*** 设备状态 */
    private Integer deviceStatus;
    
}
