package com.hoolink.sdk.enums;

/**
 * @author zhouyun
 * @description 物质类型枚举
 * @date 2018/12/19 16:54
 **/
public enum MatterEnum {
    // ----- 一氧化碳
    CO(1L, "一氧化碳", "CO", "mg/m³"),
    // ----- 硫化氢
    H2S(2L, "硫化氢", "H2S", "mg/m³"),
    // ----- 一氧化氮
    NO(3L, "一氧化氮", "NO", "mg/m³"),
    // ----- 二氧化氮
    NO2(4L, "二氧化氮", "NO2", "mg/m³"),
    // ----- 臭氧
    O3(5L, "臭氧", "O3", "mg/m³"),
    // ----- 二氧化硫
    SO2(6L, "二氧化硫", "SO2", "mg/m³"),
    // ----- 挥发性有机化合物
    VOC(7L, "挥发性有机化合物", "VOC", "mg/m³"),
    // ----- 溶解氧
    DO(8L, "溶解氧", "DO", "mg/m³"),
    // ----- PH值
    PH(9L, "PH值", "PH", null),
    // ----- 温度
    TEMP(10L, "温度", "TEMP", "℃"),
    // ----- 浊度
    TURBIDITY(11L, "浊度", "TURBIDITY", "mg/L"),
    // ----- 电导率
    EC(12L, "电导率", "EC", "S/m"),
    // ----- 湿度
    HUMIDITY(13L, "湿度", "HUMIDITY", "%"),
    // ----- 气压
    HPA(14L, "气压", "HPA", "kPa"),
    // ----- 大气压
    ATM(15L, "大气压", "ATM", "kPa"),
    // ----- 紫外线
    UV(16L, "紫外线", "UV", "UVI"),
    // ----- 噪声
    NOISE(17L, "噪声", "NOISE", "dB"),
    // ----- 风速
    WIND_SPEED(18L, "风速", "WIND_SPEED", "m/s"),
    // ----- 雨量
    RAIN_FALL(19L, "雨量", "RAIN_FALL", "mm"),
    // ----- 辐射
    RADIATION(20L, "辐射", "RADIATION", "rad"),
    // ----- PM2.5
    PM_TWO_POINT_FIVE(21L, "PM2.5", "PM_TWO_POINT_FIVE", "μg/m³"),
    // ----- PM10
    PM_TEN(22L, "PM10", "PM_TEN", "μg/m³"),
    // ----- 水位
    WATER_LEVEL(23L, "水位", "WATER_LEVEL", "cm"),
    // ----- 风向
    WIND_DIRECTION(24L, "风向", "WIND_DIRECTION", "°"),
    // ----- 电流
    CURRENT(25L, "电流", "CURRENT", "mA"),
    // ----- 电压
    VOLTAGE(26L, "电压", "VOLTAGE", "V"),
    // ----- 功率
    BRIGHT(27L, "功率", "bright", "W"),
    // ----- 光衰
    LUMINOUS_ATTENUATION(28L, "光衰", "LUMINOUS_ATTENUATION", "db"),
    // ----- 耗电量
    POWER_CONSUMPTION(29L, "耗电量", "POWER_CONSUMPTION", "kW·h"),
    // ----- 工作时长
    WORK_TIME(30L, "工作时长", "WORK_TIME", "h"),
    // ----- 巡检时间
    INSPECTION_TIME(31L, "巡检时间", "INSPECTION_TIME", "h");

    /*** 元素ID */
    private Long type;
    /*** 元素名称 */
    private String name;
    /*** 元素代号 */
    private String code;
    /*** 元素单位 */
    private String unit;

    public Long getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getUnit() {
        return unit;
    }

    MatterEnum(Long type, String name, String code, String unit) {
        this.type = type;
        this.name = name;
        this.code = code;
        this.unit = unit;
    }

    public static final MatterEnum getByType(Long type) {
        for (MatterEnum matter : MatterEnum.values()) {
            if (matter.type.equals(type)) {
                return matter;
            }
        }
        return null;
    }

}
