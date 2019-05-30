package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author zhouyun
 * @date 2019/5/22 15:26
 * @desc 更新数字音响媒体音乐清单的播放状态
 **/
@Data
public class UpdateTaskPlayStatusParamBO {

    /** 三方任务ID */
    private String random;
    /** 配置清单播放状态：0 未播放，1，播放 */
    private Boolean playStatus;

}
