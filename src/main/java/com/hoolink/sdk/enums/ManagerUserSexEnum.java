package com.hoolink.sdk.enums;

/**
 * @author lijunling
 * @description
 * @date 2019/05/15 19:03
 */
public enum ManagerUserSexEnum {
	/**
	 * 男
	 */
    SEX_MALE(true,"男"),
    /**
     * 女
     */
    SEX_MADAM(false,"女");
    
    private Boolean key;
    private String value;
    
    ManagerUserSexEnum(Boolean key, String value){
        this.key = key;
        this.value = value;
    }

	public Boolean getKey() {
		return key;
	}

	public void setKey(Boolean key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
