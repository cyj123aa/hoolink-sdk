package com.hoolink.sdk.enums;

/**
 * 权限
 * @author lijunling
 *
 * @date 2019/05/18 11:43
 */
public enum PermissionEnum {
	/**
	 * 只读
	 */
	READ_ONLY(1, "只读"),
	/**
	 * 全部(读、写)
	 */
	ALL(2, "全部(读、写)");
	
    private Integer key;
    private String value;
    
    PermissionEnum(Integer key, String value){
        this.key = key;
        this.value = value;
    }
    
	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static String getValue(Integer key) {
    	if(key != null) {
        	for(PermissionEnum permissionEnum : PermissionEnum.values()) {
        		if(permissionEnum.key.intValue() == key.intValue()) {
        			return permissionEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
