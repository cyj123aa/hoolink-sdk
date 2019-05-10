package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author chenzhixiong
 * @date 2019/3/20 11:14
 */
@Data
public class TerminalControlBO {

    /**
     * 源终端
     */
    @NotBlank(message = "source不能为空")
    private String source;
    /**
     * 目标终端
     */
    @NotEmpty(message = "target不能为空")
    private List<String> target;
    /**
     * 命令类型 （1：对讲 2：监听 3：广播 5：会议）
     */
    @NotBlank(message = "commandtype不能为空")
    private String commandtype;
    /**
     * 是否停止 （0：开始 1：停止 2：接听【当命令类型为“对讲”时有效】）
     */
    @NotBlank(message = "isstop不能为空")
    private String isstop;
    /**
     * 可在推送接口中返回(扩展字段)
     */
    @NotBlank(message = "extdata不能为空")
    private String extdata;
}
