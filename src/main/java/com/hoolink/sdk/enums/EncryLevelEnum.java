package com.hoolink.sdk.enums;

/**
 * @author lijunling
 * @description 密保等级
 * @date 2019/05/15 19:03
 */
public enum EncryLevelEnum {
	/**
	 * 一级
	 */
	ONE(1, "一级"),
	/**
	 * 二级
	 */
	TWO(2, "二级"),
	/**
	 * 三级
	 */
	THREE(3, "三级"),
	/**
	 * 四级
	 */
	FOUR(4, "四级");
	
    private Integer key;
    private String value;
    
    EncryLevelEnum(Integer key, String value){
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
        	for(EncryLevelEnum encryLevelEnum : EncryLevelEnum.values()) {
        		if(encryLevelEnum.key.intValue() == key.intValue()) {
        			return encryLevelEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
