package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @ClassName TaskStrategyBO
 * @Author huyaxi
 * @DATE 2019/5/15 14:43
 */
@Data
public class TaskStrategyBO {
    /**
     * ID
     * 表字段 : task_strategy.id
     */
    private Long id;

    /**
     * 策略日期
     * 表字段 : task_strategy.strategy_date
     */
    private String strategyDate;

    /**
     * 任务ID
     * 表字段 : task_strategy.task_id
     */
    private Long taskId;
}
