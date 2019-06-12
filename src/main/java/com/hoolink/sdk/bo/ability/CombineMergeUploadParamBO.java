package com.hoolink.sdk.bo.ability;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月10日-上午11:22:17
 */
@Data
public class CombineMergeUploadParamBO {
	private List<CombineUploadIdAndPartPairBO> idAndPartPairList;
    private String fileName;
    private Long fileSize;
}
