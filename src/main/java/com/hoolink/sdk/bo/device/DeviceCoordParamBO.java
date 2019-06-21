package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiaolei.yang..
 * @date 2019-05-14 17:38.
 * <p>
 * description:
 */
@Data
public class DeviceCoordParamBO implements Serializable {

    /*** 经纬度坐标 */
    private BigDecimal longitude;
    private BigDecimal latitude;
}
