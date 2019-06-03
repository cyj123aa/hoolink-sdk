package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName FaceHistoryBO
 * @Author huyaxi
 * @DATE 2019/5/31 9:55
 */
@Data
public class FaceHistoryBO {
    private Long projectId;
    private LocalDateTime faceDate;
    private Long bigObsId;
    private Long smallObsId;
    private String faceLabelId;
    private Long deviceId;
}
