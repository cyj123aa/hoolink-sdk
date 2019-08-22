package com.hoolink.sdk.enums.analysis;
/**
 * @author chenyuejun.
 * @date 2018-12-27 10:00.
 * <p>
 * description: 语音控制设备
 */
public enum TypeEnum {
    LIGHT((byte)1,"单灯"),
    MEDIA((byte)2,"音响"),
    SCREEN((byte)3,"显示屏"),
    ALL((byte)4,"全部初始化加载");


    public Byte key;
    public String name;
    TypeEnum(Byte key, String name) {
        this.key = key;
        this.name = name;
    }
}
