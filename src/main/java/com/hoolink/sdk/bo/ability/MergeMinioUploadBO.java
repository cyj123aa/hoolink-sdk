package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月10日-上午11:22:17
 */
@Data
public class MergeMinioUploadBO {
	private Long obsId;
	private String objectName;
    private String uploadId;
    private MinioPartBO[] parts;
}
