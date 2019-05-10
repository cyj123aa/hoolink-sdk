package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * @ClassName ObsBO
 * @Author Administrator
 * @DATE 2019/4/28 11:15
 */
@Data
public class ObsBO {

    private Long id;

    private String bucketName;

    private String objectKey;

    private String etag;

    private String versionId;

    private Long creator;

    private Long created;

    private String fileName;

    private String fileExt;

    private Long fileSize;

    private Long updator;

    private Long updated;

    private Boolean enabled;

    private String objectUrl;
}
