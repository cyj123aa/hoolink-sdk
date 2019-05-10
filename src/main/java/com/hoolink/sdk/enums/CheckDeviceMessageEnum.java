package com.hoolink.sdk.enums;

/**
 * 录入设备检测枚举
 * @Author: tonghao
 * @Date: 2019/5/5 19:34
 */
public enum CheckDeviceMessageEnum {

    /** 物理地址是否重复 */
    MAC_EXIST("mac","物理地址已存在");

    private String name;

    private String message;

    CheckDeviceMessageEnum(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getMessage(String name) {
        for (CheckDeviceMessageEnum anEnum :CheckDeviceMessageEnum.values()){
            if (anEnum.name.equalsIgnoreCase(name)){
                return anEnum.message;
            }
        }
        return null;
    }
}
