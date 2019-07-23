package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName JobData
 * @Author huyaxi
 * @DATE 2019/6/25 15:22
 */
@Data
@AllArgsConstructor
public class JobData<T> implements Serializable {
    private String url;
    private T params;
}
