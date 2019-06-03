package com.hoolink.sdk.enums;

/**
 * @author lijunling
 * @description 密保等级
 * @date 2019/05/15 19:03
 */
public enum EncryLevelEnum {
	/**
	 * 特级
	 */
	SUPER(1, "特级"),
	/**
	 * 一级
	 */
	ONE(2, "一级"),
	/**
	 * 二级
	 */
	TWO(3, "二级"),
	/**
	 * 三级
	 */
	THREE(4, "三级"),
	/**
	 * 四级
	 */
	FOUR(5, "四级");
	
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
        		if(encryLevelEnum.key.equals(key)) {
        			return encryLevelEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
