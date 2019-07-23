package com.hoolink.sdk.bo.alarm;

import lombok.Data;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-10 17:47.
 * <p>
 * description:
 */
@Data
public class MonitorDeviceDataBO {
    private static final long serialVersionUID = 6825318401784818860L;

    /*** 气体监测 */
    private GasDeviceDataBO gas;

    /*** 水位监测 */
    private WaterGaugeDeviceDataBO waterGauge;

    /*** 环境监测 */
    private EnvironmentDeviceDataBO environment;

    /*** 漏电监测 */
    private LeakageDetectDeviceDataBO leakageDetect;

}
