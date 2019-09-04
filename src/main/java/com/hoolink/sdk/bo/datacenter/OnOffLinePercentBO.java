package com.hoolink.sdk.bo.datacenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName OnOffLinePercentBO
 * @Author huyaxi
 * @DATE 2019/9/4 10:10
 */
@Data
public class OnOffLinePercentBO implements Serializable {
    private Double onLinePercent;
    private Double offLinePercent;
}
