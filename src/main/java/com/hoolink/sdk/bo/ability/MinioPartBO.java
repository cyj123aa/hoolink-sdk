package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月10日-上午11:26:03
 */
@Data
public class MinioPartBO{
	private Integer partNumber;
	private String etag;
	private String uploadAlias;
	
	public MinioPartBO(Integer partNumber, String etag) {
		super();
		this.partNumber = partNumber;
		this.etag = etag;
	}
}
