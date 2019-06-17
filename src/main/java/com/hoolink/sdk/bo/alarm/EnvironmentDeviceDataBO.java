package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.annotation.AlarmItem;
import com.hoolink.sdk.enums.alarm.ItemEnum;
import lombok.Data;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 11:00.
 * <p>
 * description:
 */
@Data
public class EnvironmentDeviceDataBO extends MonitorNodeBO {
    private static final long serialVersionUID = -3848667863849504569L;

    /*** 温度 */
    @AlarmItem(ItemEnum.ENVIRONMENT_TEMPERATURE)
    private Double temperature;

    /*** 湿度 */
    @AlarmItem(ItemEnum.HUMIDITY)
    private Double humidity;

    /*** 气压 */
    @AlarmItem(ItemEnum.AIR_PRESSURE)
    private Double airPressure;

    /*** 辐射 */
    @AlarmItem(ItemEnum.RADIATION)
    private Double radiation;

    /*** 风向 */
    @AlarmItem(ItemEnum.WIND_DIRECTION)
    private Double windDirection;

    /*** 风速 */
    @AlarmItem(ItemEnum.WIND_SPEED)
    private Double windSpeed;

    /*** PM2.5 */
    @AlarmItem(ItemEnum.PM2_5)
    private Double pm25;

    /*** PM10 */
    @AlarmItem(ItemEnum.PM10)
    private Double pm10;

    /*** 紫外线 */
    @AlarmItem(ItemEnum.ULTRAVIOLET)
    private Double ultraviolet;

    /*** 噪音 */
    @AlarmItem(ItemEnum.NOISE)
    private Double noise;

    /*** 降雨量 */
    @AlarmItem(ItemEnum.RAINFALL)
    private Double rainfall;

}
