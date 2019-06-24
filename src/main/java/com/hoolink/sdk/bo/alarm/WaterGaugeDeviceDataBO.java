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
public class WaterGaugeDeviceDataBO extends MonitorNodeBO {
    private static final long serialVersionUID = 3213604771393205382L;

    /*** 水位 */
    @AlarmItem(ItemEnum.WATER_GAUGE)
    private Double waterGauge;

}
