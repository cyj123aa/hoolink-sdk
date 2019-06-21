package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月12日-上午11:32:57
 */
@Data
public class MinioMergeUploadParamBO {
	private CombineUploadIdAndPartPairBO idAndPartPair;
    private String fileName;
    private Long fileSize;
}
