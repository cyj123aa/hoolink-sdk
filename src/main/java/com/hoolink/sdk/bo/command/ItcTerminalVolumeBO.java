package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author chenzhixiong
 * @date 2019/3/29 14:52
 */
@Data
public class ItcTerminalVolumeBO {

    /**
     * 设备号码
     */
    @NotEmpty(message = "telephones不能为空")
    private List<String> telephones;
    /**
     * 音量
     */
    @NotBlank(message = "vol不能为空")
    private String vol;
}
