package com.hoolink.sdk.enums;

/**
 * 
 * @author lijunling
 * @description 正常、禁用状态
 * @date 2019/05/15 18:55
 */
public enum StatusEnum {
	OPEN(true, "启用"),
	CLOSE(false, "禁用");
	
    private Boolean key;
    private String value;
    
    StatusEnum(Boolean key, String value){
    	this.key = key;
    	this.value = value;
    }
    
    public static String getValue(Boolean key) {
    	if(key != null) {
        	for(StatusEnum statusEnum : StatusEnum.values()) {
        		if(statusEnum.key.booleanValue() == key.booleanValue()) {
        			return statusEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
