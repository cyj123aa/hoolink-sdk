package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.ScreenSendStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: zhujinting
 * @date: 2019/1/9
 * @description: 显示屏下发配置清单进度和状态类
 */
@Data
@AllArgsConstructor
public class ScreenSendBO {
    /*** 下发状态 */
    private ScreenSendStatusEnum statusEnum;

    /*** 下发完成度 */
    private Integer sendRate;

    /*** 显示屏ID */
    private Long screenId;

}
