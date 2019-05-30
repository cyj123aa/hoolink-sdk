package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName CreateFaceLabelBO
 * @Author huyaxi
 * @DATE 2019/5/30 11:18
 */
@Data
public class CreateFaceLabelBO {
    @NotNull
    private String objectKey;
    @NotNull
    private String faceSetName;
    @NotNull
    private String bucketName;

}
