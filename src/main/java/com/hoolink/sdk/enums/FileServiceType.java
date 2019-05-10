package com.hoolink.sdk.enums;

/**
 * Created by wm on 2018/02/01.
 */
public enum FileServiceType {
    /**
     * 业务类型：pole
     */
    POLE("pole"),
    /**
     * 业务类型：project
     */
    PROJECT("project"),
    ;
    private String key;

    FileServiceType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
