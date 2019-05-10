package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @description websocket事件类型枚举类
 * @date 2018/12/29 9:52
 **/
public enum SocketEventType {

    /**
     * 单灯批量操作的结果返回
     */
    LIGHT_OPERATION_RECORD(1);

    int type;

    SocketEventType(int type) {
        this.type = type;
    }

    public int getType(){
        return type;
    }
}


