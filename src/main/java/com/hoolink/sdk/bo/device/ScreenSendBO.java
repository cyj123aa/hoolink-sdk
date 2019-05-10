package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.ScreenSendStatusEnum;
import lombok.Data;

/**
 * @author: zhujinting
 * @date: 2019/1/9
 * @description: 显示屏下发配置清单进度和状态类
 */
@Data
public class ScreenSendBO {
    /**
     * 下发状态
     */
    private ScreenSendStatusEnum statusEnum;
    /**
     * 下发完成度
     */
    private Integer sendRate;

    private Long screenId;

}
