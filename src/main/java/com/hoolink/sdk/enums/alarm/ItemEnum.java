package com.hoolink.sdk.enums.alarm;

import com.hoolink.sdk.enums.DeviceTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 13:57.
 * <p>
 * description:
 * 告警配置项枚举
 */
public enum ItemEnum {
    /*** 智能照明-电流 */
    CURRENT(1L, "电流", "mA", DeviceTypeEnum.LIGHT),
    /*** 智能照明-电压 */
    VOLTAGE(2L, "电压", "V", DeviceTypeEnum.LIGHT),
    /*** 智能照明-温度 */
    LIGHT_TEMPERATURE(3L, "温度", "℃", DeviceTypeEnum.LIGHT),
    /*** 智能照明-光衰 */
    LIGHT_WEAK(4L, "光衰", "dB", DeviceTypeEnum.LIGHT),
    /*** 环境监测 */
    ENVIRONMENT_TEMPERATURE(5L, "温度", "℃", DeviceTypeEnum.ENVIRONMENT),
    HUMIDITY(6L, "湿度", "%", DeviceTypeEnum.ENVIRONMENT),
    AIR_PRESSURE(7L, "气压", "kPa", DeviceTypeEnum.ENVIRONMENT),
    RADIATION(8L, "辐射", "W/m2", DeviceTypeEnum.ENVIRONMENT),
    WIND_DIRECTION(9L, "风向", "°", DeviceTypeEnum.ENVIRONMENT),
    WIND_SPEED(10L, "风速", "m/s", DeviceTypeEnum.ENVIRONMENT),
    PM2_5(11L, "PM2.5", "μg/m3", DeviceTypeEnum.ENVIRONMENT),
    PM10(12L, "PM10", "μg/m3", DeviceTypeEnum.ENVIRONMENT),
    ULTRAVIOLET(13L, "紫外线", "UV", DeviceTypeEnum.ENVIRONMENT),
    NOISE(14L, "噪音", "dB", DeviceTypeEnum.ENVIRONMENT),
    RAINFALL(15L, "降雨量", "mm", DeviceTypeEnum.ENVIRONMENT),
    /*** 气体监测 */
    CARBON_DIOXIDE(16L, "二氧化碳", "mg/m3", DeviceTypeEnum.GAS),
    HYDROGEN_SULFIDE(17L, "硫化氢", "mg/m3", DeviceTypeEnum.GAS),
    NITRIC_OXIDE(18L, "一氧化氮", "mg/m3", DeviceTypeEnum.GAS),
    NITROGEN_DIOXIDE(19L, "二氧化氮", "mg/m3", DeviceTypeEnum.GAS),
    OZONE(20L, "臭氧", "mg/m3", DeviceTypeEnum.GAS),
    CARBON_MONOXIDE(21L, "一氧化碳", "mg/m3", DeviceTypeEnum.GAS),
    /*** 水质监测 */
    DISSOLVED_OXYGEN(22L, "溶解氧", "mg/L", DeviceTypeEnum.WATER),
    PH(23L, "", "PH值", DeviceTypeEnum.WATER),
    WATER_TEMPERATURE(24L, "水温", "℃", DeviceTypeEnum.WATER),
    TURBIDITY(25L, "浊度", "mg/L", DeviceTypeEnum.WATER),
    ELECTRICAL_CONDUCTIVITY(28L, "电导率", "S/m", DeviceTypeEnum.WATER),
    /*** 水位监测 */
    WATER_GAUGE(27L, "水位", "mm", DeviceTypeEnum.WATER_GAUGE),
    ;

    private Long itemId;
    private String itemName;
    private String itemUnit;
    private DeviceTypeEnum deviceType;

    ItemEnum(Long itemId, String itemName, String itemUnit, DeviceTypeEnum deviceType) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemUnit = itemUnit;
        this.deviceType = deviceType;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public DeviceTypeEnum getDeviceType() {
        return deviceType;
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

    public List<ItemEnum> getByType(DeviceTypeEnum type) {
        List<ItemEnum> enums = new ArrayList<>();
        ItemEnum[] values = ItemEnum.values();
        for (ItemEnum value : values) {
            if (Objects.equals(value.deviceType, type)) {
                enums.add(value);
            }
        }
        return enums;
    }
}
