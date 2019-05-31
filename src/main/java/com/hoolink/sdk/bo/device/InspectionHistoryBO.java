package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @ClassName InspectionHistoryBO
 * @Author huyaxi
 * @DATE 2019/5/31 9:55
 */
@Data
public class InspectionHistoryBO {
    private Long projectId;
    private String faceDate;
    private Long bigObsId;
    private Long smallObsId;
    private String faceLabelId;
    private Long deviceId;
}
