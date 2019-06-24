package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.util.List;

/**
 * @author zhangxin
 * @date 2019/6/11
 */
@Data
public class ExternalDeviceDataBO extends DeviceDataBO {

    private static final long serialVersionUID = -2451138101809201942L;

    private String ack;

    private List<LightDeviceDataBO> lightDataList;
}
