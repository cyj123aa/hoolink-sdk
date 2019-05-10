package com.hoolink.sdk.enums;

/**
 * 检查项
 * @Author: tonghao
 * @Date: 2019/5/5 19:53
 */
public enum CheckOptEnum {

    /** 物理地址 */
    Mac("mac");

    private String name;

    CheckOptEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
