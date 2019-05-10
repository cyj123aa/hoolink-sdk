package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author chenzhixiong
 * @date 2019/3/18 10:00
 */
@Data
public class SetVolumeBO {
    /**
     * 终端ID
     */
    @NotEmpty(message = "tids不能为空")
    private List<String> tids;
    /**
     * 对讲输入音量 （0-15）
     */
    private String talkinv;
    /**
     * 对讲输出音量 （0-15）
     */
    private String talkoutv;
    /**
     * 广播输入入音量（0-15）
     */
    private String bcinv;
    /**
     * 广播输出音量（0-15）
     */
    private String bcoutv;
}
