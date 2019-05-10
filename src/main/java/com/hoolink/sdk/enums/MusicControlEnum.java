package com.hoolink.sdk.enums;

/**
 * @author chenzhixiong
 * @date 2019/3/14 17:24
 */
public enum MusicControlEnum {
    /**
     * 音乐控制
     *
     * */
    STOP("stoptaskinfo"),
    RUN("runtaskinfo");
    private String name;

    MusicControlEnum(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
