package com.hoolink.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2019-04-01 21:14.
 * <p>
 * description:
 */
public enum DeviceTypeEnum {
    // ----- 数字监控
    CAMERA(1L, "camera"),
    // ----- 数字音响
    SOUND_BOX(2L, "sound_box"),
    // ----- 一检呼救
    CALL(3L, "call"),
    // ----- 智能巡检
    NFC(4L, "nfc"),
    // ----- 信息发布
    SCREEN(5L, "screen"),
    // ----- 环境监测
    ENVIRONMENT(6L, "environment"),
    // ----- 智能照明
    LIGHT(7L, "light"),
    // ----- 实时广播
    BROADCAST(8L, "broadcast"),
    // ----- 监控器
    MONITOR(9L, "monitor"),
    // ----- 漏电保护
    LEAKAGE_DETECT(10L, "leakage_detect"),
    // ----- 气体检测
    GAS(11L, "gas"),
    // ----- 水位检测
    WATER_GAUGE(12L, "water_gauge"),
    // ----- 智能灯杆
    POLE(13L, "pole"),
    // ----- 集中器
    EXTERNAL(14L, "external"),
    // ----- 土壤检测
    SOIL(15L, "soil"),
    // ----- 水质检测
    WATER(16L, "water"),
    //----- 温湿度
    TEM_HUMIDITY(17L, "tem_humidity");

    private Long deviceType;
    private String deviceCode;

    public Long getDeviceType() {
        return deviceType;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    private DeviceTypeEnum(Long deviceType, String deviceCode) {
        this.deviceType = deviceType;
        this.deviceCode = deviceCode;
    }

    public static final DeviceTypeEnum getByType(Long type) {
        for (DeviceTypeEnum deviceType : DeviceTypeEnum.values()) {
            if (deviceType.deviceType.equals(type)) {
                return deviceType;
            }
        }
        return null;
    }

    public static final DeviceTypeEnum getTypeByCode(String code) {
        for (DeviceTypeEnum deviceType : DeviceTypeEnum.values()) {
            if (deviceType.deviceCode.equals(code)) {
                return deviceType;
            }
        }
        return null;
    }
}
