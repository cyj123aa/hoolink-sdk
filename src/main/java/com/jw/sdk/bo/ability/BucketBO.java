package com.jw.sdk.bo.ability;

import lombok.Data;

/**
 * @ClassName BucketBO
 * @Author  Administrator
 * @DATE 2019/4/28 13:09
 */
@Data
public class BucketBO {

    private Long id;

    private String bucketName;

    private Long projectId;

    private Byte bucketAcl;

    private Byte bucketType;

    private Long creator;

    private Long created;

    private Long updator;

    private Long updated;

}
