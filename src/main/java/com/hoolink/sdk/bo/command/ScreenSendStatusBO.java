package com.hoolink.sdk.bo.command;

import com.hoolink.sdk.bo.device.ScreenSendBO;
import lombok.Data;

import java.util.Map;

/**
 * @author ${zht}
 * @date 2019/1/7
 */
@Data
public class ScreenSendStatusBO {
    /**
     * 清单Id;
     */
    private Long configId;

    /**
     *  k: channel
     *  v: 状态+进度
     */
    private Map<String, ScreenSendBO> sendStatusMap;
}
