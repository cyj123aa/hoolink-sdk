package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName ForceStartScheduleTaskBO
 * @Author huyaxi
 * @DATE 2019/5/27 17:06
 */
@Data
public class ForceStartScheduleTaskBO implements Serializable {
    /**
     * 当前要开启的任务ID
     */
    private Long taskId;

    /**
     * 冲突的任务ID列表
     */
    private List<Long> conflictTaskIds;
}
