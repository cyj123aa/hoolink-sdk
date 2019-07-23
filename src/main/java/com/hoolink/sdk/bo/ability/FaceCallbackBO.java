package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * @ClassName FaceConfigVO
 * @Author Administrator
 * @DATE 2019/3/7 17:03
 */
@Data
public class FaceCallbackBO {
    private String faceThreshold;
    private String memberNotifyHttpAddr;
    private String strangerNotifyHttpAddr;
    private Long projectId;
}
