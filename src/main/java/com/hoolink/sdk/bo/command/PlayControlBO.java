package com.hoolink.sdk.bo.command;


import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author ${zht}
 * @date 2018/9/27
 */
@Data
public class PlayControlBO {
    /**
     * 当前任务标识(即播放配置中的随机数rand)
     */
    @NotBlank(message = "internalName不能为空")
    private String internalName;
    /**
     * 播放音乐模式，播放play，停止stop，暂停pause，下一曲next_music，上一曲previous
     */
    @NotBlank(message = "dataType不能为空")
    private String dataType;

}
