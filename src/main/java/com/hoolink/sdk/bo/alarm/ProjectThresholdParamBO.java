package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/10 15:54
 */
@Data
public class ProjectThresholdParamBO implements Serializable {
    private static final long serialVersionUID = -865715181240555991L;
    
    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /*** 设备类型ID */
    private Long deviceTypeId;
}
