package com.hoolink.sdk.enums;

/**
 * @author tonghao
 * @description
 * @date 2019/08/02 14:53
 */
public enum ManagerUserReceiveSmsEnum {
	/**
	 * 男
	 */
    YES(true,"是"),
    /**
     * 女
     */
    NO(false,"否");

    private Boolean key;
    private String value;

    ManagerUserReceiveSmsEnum(Boolean key, String value){
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
	
	public static String getValue(Boolean key) {
    	if(key != null) {
        	for(ManagerUserReceiveSmsEnum userSexEnum : ManagerUserReceiveSmsEnum.values()) {
        		if(userSexEnum.key.equals(key)) {
        			return userSexEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
