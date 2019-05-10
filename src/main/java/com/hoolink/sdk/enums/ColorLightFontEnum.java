package com.hoolink.sdk.enums;

/**
 * @packageName:.pojo.param.command
 * @author:zhaojunwei
 * @date:2018/7/28
 * @description: 字体枚举
 */
public enum ColorLightFontEnum {
    /**
     * 黑体
     */
    Black_body(1,"黑体"),
    /**
     * 楷体
     */
    Carcass(2,"楷体"),
    /**
     * 宋体
     */
    Song(3,"宋体"),
    ;
    private Integer key;
    private String value;

    ColorLightFontEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Integer key) {
        for (ColorLightFontEnum fontEnum : ColorLightFontEnum.values()) {
            if (fontEnum.key.equals(key)) {
                return fontEnum.value;
            }
        }
        return null;
    }
}
