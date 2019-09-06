package com.hoolink.sdk.bo.datacenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName OnLinePercentBO
 * @Author huyaxi
 * @DATE 2019/9/6 15:43
 */
@Data
public class OnLinePercentBO implements Serializable {
    private String onLineTime;
    private Double onLinePercent;
}
