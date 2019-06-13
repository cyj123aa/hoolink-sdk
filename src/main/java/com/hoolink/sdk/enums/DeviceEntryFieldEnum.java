package com.hoolink.sdk.enums;

/**
 * @Author: tonghao
 * @Date: 2019/5/7 11:42
 */
public enum DeviceEntryFieldEnum {

    SUBTYPENAME("subTypeName"),
    DEVICENAME("deviceName"),
    POLEMAC("poleMac"),
    POLESUBTYPENAME("poleSubTypeName"),
    EXTERNAL("externalMac"),
    EXTERNALSUBTYPENAME("externalSubTypeName"),
    MAC("mac"),
    INSTALLADDRESS("installAddress"),
    DESCRIPTION("description"),
    MODELNO("modelNo"),
    IP("ipAddr"),
    PORT("ipPort"),
    DEVICENO("deviceNo"),
    VALIDATECODE("validateCode"),
    LEAKAGE("leakage"),
    ENVIRONMENT("environment"),
    WATERLEVEL("waterLevel"),
    GAS("gas"),
    OPERATE("operate"),
    ID("id"),
    BROADCASTSUBTYPENAME("broadcastSubTypeName"),
    BROADCASTMAC("broadcastMac"),
    VERIFYCODE("verifyCode"),
    ;

    private String field;

    DeviceEntryFieldEnum(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
