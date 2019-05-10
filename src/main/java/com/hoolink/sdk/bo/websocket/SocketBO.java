package com.hoolink.sdk.bo.websocket;

import com.hoolink.sdk.enums.SocketEventType;
import lombok.Data;

/**
 * @author zhouyun
 * @description websocket推送前端的BO
 * @date 2018/12/29 10:01
 **/
@Data
public class SocketBO<T> {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 事件类型SocketEventType
     */
    private SocketEventType type;
    /**
     * 页面需要推送的数据
     */
    private T data;

}
