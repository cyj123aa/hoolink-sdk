package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-31 17:31.
 * <p>
 * description:
 */
@Data
public class ScreenPlayScheduleBO implements Serializable {
    private static final long serialVersionUID = 4226193119686522141L;

    private Long configId;

    /*** 执行任务的类名称 */
    private String className;

    /*** 定时任务表达式 */
    private String cronExpression;

    /*** 任务名称 */
    private String jobName;

    /*** 任务分组 */
    private String jobGroup;

    /*** 触发器名称 */
    private String triggerName;

    /*** 触发器分组 */
    private String triggerGroup;

    /*** 任务描述 */
    private String description;

    /*** 创建时间 */
    private Long createTime;

    /*** 定时任务任务ID */
    private Long playId;

    /*** 开启\关闭(0:关闭;1:开启) */
    private Boolean playStatus;
}
