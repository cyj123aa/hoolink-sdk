package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/12 14:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SpecialThresholdParamBO extends PageParam implements Serializable {
    private static final long serialVersionUID = 655302141067579887L;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    /*** 特殊阈值类型 */
    private Byte itemType;

    /*** 设备名称 */
    private String deviceName;
}
