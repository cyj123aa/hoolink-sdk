package com.hoolink.sdk.enums;

/**
 * @Author: tonghao
 * @Date: 2019/5/7 9:57
 */
public enum CheckOptMessageEnum {

    DEVICE_SUB_TYPE_NAME_IS_NULL("型号为空"),
    DEVICE_NAME_IS_NULL("名称为空"),
    MAC_IS_NULL("物理地址为空"),
    DEVICE_SUB_TYPE_EXIST("型号已存在"),
    MAC_EXIST("物理地址重复"),
    ;

    public String message;

    CheckOptMessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
