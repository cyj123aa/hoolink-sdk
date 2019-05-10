package com.hoolink.sdk.bo.ability;

import lombok.Data;

import java.util.List;

/**
 * @ClassName MerageUpload
 * @Author Administrator
 * @DATE 2019/4/28 16:30
 */
@Data
public class MerageUpload {
    private String uploadId;
    private List<PartEtag> partEtags;
    private String fileName;
    private Long projectId;
    private Long fileSize;
}
