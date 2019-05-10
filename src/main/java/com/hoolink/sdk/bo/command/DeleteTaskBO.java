package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 11:31
 */
@Data
public class DeleteTaskBO {
    /**
     * 任务id
     */
    @NotBlank(message = "taskId不能为空")
    private String taskId;
}
