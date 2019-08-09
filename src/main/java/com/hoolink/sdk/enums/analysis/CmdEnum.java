package com.hoolink.sdk.enums.analysis;
/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public enum CmdEnum {
    /*** 命令下发 */
    Light("1","下发单灯"),Broadcast("2","下发音响播放"),
    BroadcastConfig("3","暂停继续音响"),PlayScreen("4","播放显示屏"),
    StopScreen("5","停止显示屏"),
    UNKUOW("9","未知命令");


    public String key;
    public String name;
    CmdEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }


}
