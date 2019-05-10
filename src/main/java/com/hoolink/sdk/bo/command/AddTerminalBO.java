package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 15:18 添加终端bo
 */
@Data
public class AddTerminalBO extends TerminalTypeBO{

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
     * 呼救目标
     */
    private String tcalltarget1;

    /**
     * 终端级别（0-15）， 默认为0
     */
    private String tterminallevel;

    /**
     * 绑定外部视频路径（默认为空）
     */
    private String trtspurl;
    /**
     * 终端密码（默认为1234）
     */
    private String tpass;
}
