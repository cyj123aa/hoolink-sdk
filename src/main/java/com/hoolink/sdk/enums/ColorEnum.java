package com.hoolink.sdk.enums;

/**
 * @packageName:.pojo.param.command
 * @author:zhaojunwei
 * @date:2018/7/28
 * @description: 颜色枚举
 */
public enum ColorEnum {
    /**
     * 红色
     */
    RED(1,"0xFF0000"),
    /**
     * 绿色
     */
    GREEN(2,"0x008000"),
    /**
     * 蓝色
     */
    BLUE(3,"0x0000FF"),
    /**
     * 白色
     */
    WHITE(7,"0xFFFFFF"),
    /**
     * 黄色
     */
    YELLOW(4,"0xFFFF00"),
    /**
     * 紫色
     */
    PURPLE(5,"0x800080"),
    /**
     * 青色
     */
    CYAN(6,"0x00FFFF"),
    /**
     * 黑色
     */
    BLACK(8,"0x000000"),
    ;
    private Integer key;
    private String value;

    ColorEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(Integer key) {
        for (ColorEnum colorEnum : ColorEnum.values()) {
            if (colorEnum.key.equals(key)) {
                return colorEnum.value;
            }
        }
        return null;
    }
}
