package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyun
 * @date 2019/8/22 15:51
 * @desc
 **/
@Data
public class BatchUpdateDevVolumeBO implements Serializable {

    private static final long serialVersionUID = -2443364253707002128L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "终端ID不能为空")
    private List<String> devIds;
    /** 终端音量 0-100 */
    private String devVolume;
    /** 终端开关 0：关 1：开 */
    private String devSwitchState;
    /** 当前时间 */
    private Long time;
}
