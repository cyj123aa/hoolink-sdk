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
    /** 登录用户名 (必填) */
    private String loginName;
    /** 终端编号 (必填) */
    private List<String> devNoList;
    /** 终端音量 0-100 (必填) */
    @NotBlank(message = "终端编号不能为空")
    private String devVolume;
    /** 终端开关 0：关 1：开 */
    private String devSwitchState;
    /** 当前时间 */
    private Long time;
    /** 终端编号 (必填) */
    @NotBlank(message = "广播室ID不能为空")
    private String roomId;
}
