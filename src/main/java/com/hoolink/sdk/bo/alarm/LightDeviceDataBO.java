package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.annotation.AlarmItem;
import com.hoolink.sdk.enums.alarm.ItemEnum;
import lombok.Data;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-10 17:48.
 * <p>
 * description:
 */
@Data
public class LightDeviceDataBO extends DeviceDataBO {

    private static final long serialVersionUID = -47675939663507389L;

    /*** ACK码 */
    private String ack;

    /*** 电流 */
    @AlarmItem(ItemEnum.CURRENT)
    private Integer current;

    /*** 电压 */
    @AlarmItem(ItemEnum.VOLTAGE)
    private Integer voltage;

    /*** 温度 */
    @AlarmItem(ItemEnum.LIGHT_TEMPERATURE)
    private Integer temperature;

    /*** 光衰 */
    @AlarmItem(ItemEnum.LIGHT_WEAK)
    private Integer lightWeak;
}
