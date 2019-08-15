package com.hoolink.sdk.enums.analysis;
/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public enum CmdEnum {
    /*** 命令下发 */
    LIGHT("1","下发单灯"),
    MEDIA("2","下发音响"),
    MEDIA_VOLUME("3","音响调音"),
    SCREEN("4","下发显示屏"),
    SCREEN_VOLUME("5","显示屏亮度"),
    UNKNOWN("9","未知命令");


    public String key;
    public String name;
    CmdEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }


}
