package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月12日-上午10:48:16
 */
@Data
public class DownloadUrlResultBO {
	private DownloadUrlParamBO param;
	private Long minioId;
	private String url;
}
