package com.hoolink.sdk.bo.alarm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/10 15:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectThresholdParamBO implements Serializable {
    private static final long serialVersionUID = -865715181240555991L;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /*** 设备类型ID */
    private Long deviceTypeId;

    /*** 设备ID */
    private Long deviceId;
}
