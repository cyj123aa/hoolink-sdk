package com.hoolink.sdk.enums;

import com.hoolink.sdk.utils.ByteUtil;

/**
 * @author ${zht}
 * @date 2019/1/7
 */
public enum  ScreenSendStatusEnum {
    /**
     * 下发中
     */
    SEND((byte)0,"下发中"),

    /**
     * 下发成功
     */
    SEND_OK((byte)1,"下发成功"),

    /**
     * 下发失败
     */
    SEND_ERROR((byte)2,"下发失败")
    ;

    private Byte type;
    private String name;

    ScreenSendStatusEnum(Byte type, String name) {
        this.type = type;
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
