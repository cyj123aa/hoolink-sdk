package com.hoolink.sdk.enums.alarm;

import java.util.Objects;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 13:57.
 * <p>
 * description:
 * 告警配置项枚举
 */
public enum ItemEnum {
    /*** 智能照明 */
    CURRENT(5L, "温度", "℃"),
    VOLTAGE(5L, "温度", "℃"),
    LIGHT_TEMPERATURE(5L, "温度", "℃"),
    DROOP(5L, "温度", "℃"),
    /*** 环境监测 */
    ENVIRONMENT_TEMPERATURE(5L, "温度", "℃"),
    HUMIDITY(6L, "湿度", "%"),
    AIR_PRESSURE(7L, "气压", "kPa"),
    RADIATION(8L, "辐射", "W/m2"),
    WIND_DIRECTION(9L, "风向", "°"),
    WIND_SPEED(10L, "风速", "m/s"),
    PM2_5(11L, "PM2.5", "μg/m3"),
    PM10(12L, "PM10", "μg/m3"),
    ULTRAVIOLET(13L, "紫外线", "UV"),
    NOISE(14L, "噪音", "dB"),
    RAINFALL(15L, "降雨量", "mm"),
    /*** 气体监测 */
    CARBON_DIOXIDE(16L, "二氧化碳", "mg/m3"),
    HYDROGEN_SULFIDE(17L, "硫化氢", "mg/m3"),
    NITRIC_OXIDE(18L, "一氧化氮", "mg/m3"),
    NITROGEN_DIOXIDE(19L, "二氧化氮", "mg/m3"),
    OZONE(20L, "臭氧", "mg/m3"),
    CARBON_MONOXIDE(21L, "一氧化碳", "mg/m3"),
    /*** 水位监测 */
    WATER_GAUGE(27L, "水位", "mm"),
    ;

    private Long itemId;
    private String itemName;
    private String itemUnit;

    ItemEnum(Long itemId, String itemName, String itemUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemUnit = itemUnit;
    }

    public ItemEnum getByItemId(Long id) {
        ItemEnum[] values = ItemEnum.values();
        for (ItemEnum value : values) {
            if (Objects.equals(value.itemId, id)) {
                return value;
            }
        }
        return null;
    }
}
