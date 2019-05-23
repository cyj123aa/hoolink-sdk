package com.hoolink.sdk.enums;

/**
 * 是否可见员工密保等级
 * @author lijunling
 *
 * @date 2019/05/23 14:16
 */
public enum ViewEncryLevelPermittedEnum {
	/**
	 * 是
	 */
	TRUE(true, "是"),
	/**
	 * 否
	 */
	FALSE(false, "否");
	
    private Boolean key;
    private String value;
    
    ViewEncryLevelPermittedEnum(Boolean key, String value){
        this.key = key;
        this.value = value;
    }
    
	public static String getValue(Boolean key) {
    	if(key != null) {
        	for(ViewEncryLevelPermittedEnum viewEncryLevelPermittedEnum : ViewEncryLevelPermittedEnum.values()) {
        		if(viewEncryLevelPermittedEnum.key.equals(key)) {
        			return viewEncryLevelPermittedEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
