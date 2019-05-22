package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/21 17:05
 */
@Data
public class DeviceObsRelationBO implements Serializable {
    private static final long serialVersionUID = -7778086889333821602L;

    /*** 项目ID */
    @NotNull(message = "项目ID不为空")
    private Long projectId;

    /*** 文件ID */
    @NotNull(message = "OBS ID不为空")
    private Long obsId;

}
