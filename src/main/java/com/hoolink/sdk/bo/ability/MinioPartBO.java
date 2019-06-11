package com.hoolink.sdk.bo.ability;

import lombok.Data;

/**
 * 
 * @author lijunling
 *
 * 2019年6月10日-上午11:26:03
 */
@Data
public class MinioPartBO extends CombineUploadBaseBO{
	private Integer partNumber;
	private String etag;
	
	public MinioPartBO(Integer partNumber, String etag) {
		super();
		this.partNumber = partNumber;
		this.etag = etag;
	}
}
