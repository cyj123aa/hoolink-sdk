package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.annotation.AlarmItem;
import com.hoolink.sdk.enums.alarm.ItemEnum;
import lombok.Data;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-06-12 10:59.
 * <p>
 * description:
 */
@Data
public class GasDeviceDataBO extends MonitorNodeBO {
    private static final long serialVersionUID = -8738082367126542392L;

    /*** 二氧化碳 */
    @AlarmItem(ItemEnum.CARBON_DIOXIDE)
    private Double carbonDioxide;

    /*** 硫化氢 */
    @AlarmItem(ItemEnum.HYDROGEN_SULFIDE)
    private Double hydrogenSulfide;

    /*** 一氧化氮 */
    @AlarmItem(ItemEnum.NITRIC_OXIDE)
    private Double nitricOxide;

    /*** 二氧化氮 */
    @AlarmItem(ItemEnum.NITROGEN_DIOXIDE)
    private Double nitrogenDioxide;

    /*** 臭氧 */
    @AlarmItem(ItemEnum.OZONE)
    private Double ozone;

    /*** 一氧化碳 */
    @AlarmItem(ItemEnum.CARBON_MONOXIDE)
    private Double carbonMonoxide;

}
