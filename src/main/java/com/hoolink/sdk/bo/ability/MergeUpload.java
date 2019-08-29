package com.hoolink.sdk.bo.ability;

import lombok.Data;

import java.util.List;

/**
 * @ClassName MergeUpload
 * @Author Administrator
 * @DATE 2019/4/28 16:30
 */
@Data
public class MergeUpload {
    private String uploadId;
    private List<PartEtag> partEtags;
    private String fileName;
    private Long projectId;
    private Long fileSize;
    private Long id;
    private String objectKey;
}
