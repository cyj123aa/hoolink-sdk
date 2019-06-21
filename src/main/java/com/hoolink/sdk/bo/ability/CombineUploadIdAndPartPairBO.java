package com.hoolink.sdk.bo.ability;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月11日-下午8:26:59
 */
@Data
public class CombineUploadIdAndPartPairBO {
	private CombineUploadAliasAndIdPairBO uploadAliasAndIdPair;
	private List<MinioPartBO> parts;
}
