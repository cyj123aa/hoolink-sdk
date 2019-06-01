package com.hoolink.sdk.enums;

/**
 * @author XuBaofeng.
 * @date 2019-04-01 21:14.
 * <p>
 * description:
 */
public enum DeviceTypeEnum {
    // ----- 数字监控
    CAMERA(1L, "camera", "数字监控"),
    // ----- 数字音响
    SOUND_BOX(2L, "sound_box", "数字音响"),
    // ----- 一检呼救
    CALL(3L, "call", "一检呼救"),
    // ----- 智能巡检
    NFC(4L, "nfc", "智能巡检"),
    // ----- 信息发布
    SCREEN(5L, "screen", "信息发布"),
    // ----- 环境监测
    ENVIRONMENT(6L, "environment", "环境监测"),
    // ----- 智能照明
    LIGHT(7L, "light", "智能照明"),
    // ----- 实时广播
    BROADCAST(8L, "broadcast", "实时广播"),
    // ----- 监控器
    MONITOR(9L, "monitor", "监控器"),
    // ----- 漏电监测
    LEAKAGE_DETECT(10L, "leakage_detect", "漏电监测"),
    // ----- 气体监测
    GAS(11L, "gas", "气体监测"),
    // ----- 水位监测
    WATER_GAUGE(12L, "water_gauge", "水位监测"),
    // ----- 智能灯杆
    POLE(13L, "pole", "智能灯杆"),
    // ----- 集中器
    EXTERNAL(14L, "external", "集中器"),
    // ----- 土壤监测
    SOIL(15L, "soil", "土壤监测"),
    // ----- 水质监测
    WATER(16L, "water", "水质监测"),
    //----- 温湿度
    TEM_HUMIDITY(17L, "tem_humidity", "温湿度");

    private Long deviceType;
    private String deviceCode;
    private String typeName;

    public Long getDeviceType() {
        return deviceType;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public String getTypeName() {
        return typeName;
    }

    private DeviceTypeEnum(Long deviceType, String deviceCode, String typeName) {
        this.deviceType = deviceType;
        this.deviceCode = deviceCode;
        this.typeName = typeName;
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
