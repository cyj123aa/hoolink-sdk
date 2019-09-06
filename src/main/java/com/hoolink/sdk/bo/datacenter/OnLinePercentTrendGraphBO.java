package com.hoolink.sdk.bo.datacenter;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName OnLinePercentTrendGraphBO
 * @Author huyaxi
 * @DATE 2019/9/6 15:42
 */
@Data
public class OnLinePercentTrendGraphBO implements Serializable {
    private List<String> x;
    private List<Integer> y;
}
