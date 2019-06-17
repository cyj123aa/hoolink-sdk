package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/6/10 20:21
 */
@Data
public class ThresholdProjectParamBO implements Serializable {
    private static final long serialVersionUID = 6791441743849370432L;

    /*** 项目ID */
    @NotNull(message = "项目ID不能为空")
    private Long projectId;

    private List<AlarmConfigProjectBO> alarmConfigProjectParams;
}
