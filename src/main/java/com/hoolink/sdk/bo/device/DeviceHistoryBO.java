package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

@Data
public class DeviceHistoryBO {

    private Long bizId;
    private List<Long> successDeviceList;
    private List<Long> failDeviceList;
    private List<String> errorList;
    private String macAddress;
    private String deviceType;
    private Integer cmdResult;
    private List<String> deviceNoList;

}
