package com.hoolink.sdk.enums.ability;

/**
 * 
 * @author lijunling
 *
 * 2019年6月13日-下午4:14:55
 */
public enum UploadTypeEnum {
	/**
	 * minio
	 */
	MINIO("minio"),
	/**
	 * obs
	 */
	OBS("obs");
	
    private String desc;
    
    UploadTypeEnum(String desc){
        this.desc = desc;
    }

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
