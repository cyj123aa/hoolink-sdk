package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 16:52
 */
@Data
public class UpdateTerminalBO extends TerminalTypeBO{

    /**
     * 设备id（非空数字）
     */
    @NotBlank(message = "tid不能为空")
    private String tid;

    /**
     * 终端名称（非空）
     */
    @NotBlank(message = "tname不能为空")
    private String tname;
    /**
     * 终端广播输出音量（0-15），默认9
     */
    private String tbcoutv;
    /**
     * 终端广播输入音量（0-15），默认9
     */
    private String tbcinv;
    /**
     * 终端对讲输出音量（0-15），默认9
     */
    private String ttalkoutv;
    /**
     * 终端对讲输出音量（0-15），默认9
     */
    private String ttalkinv;

    /**
     * 终端级别（0-15）， 默认为0
     */
    private String tterminallevel;

    /**
     * 呼救目标
     */
    @NotBlank(message = "tcalltarget1不能为空")
    private String tcalltarget1;
}
