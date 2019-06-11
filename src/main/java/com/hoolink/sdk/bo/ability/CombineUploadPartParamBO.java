package com.hoolink.sdk.bo.ability;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月11日-下午6:34:55
 */
@Data
public class CombineUploadPartParamBO {
	private String fileName;
	private Integer partNum;
	private List<CombineUploadAliasAndIdPairBO> uploadIdAndAliasPairList;
}
