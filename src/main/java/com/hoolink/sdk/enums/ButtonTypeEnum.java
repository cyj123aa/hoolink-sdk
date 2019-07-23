package com.hoolink.sdk.enums;

/**
 * 按钮类型枚举类
 * @author lijunling
 *
 * @date 2019/05/22 13:30
 */
public enum ButtonTypeEnum {
	/**
	 * 查询类
	 */
	READ_ONLY((byte)1, "查询类"),
	/**
	 * 操作类
	 */
	WRITABLE((byte)2, "操作类");
	
    private Byte key;
    private String value;
    
    ButtonTypeEnum(Byte key, String value){
        this.key = key;
        this.value = value;
    }
    
	public Byte getKey() {
		return key;
	}

	public void setKey(Byte key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static String getValue(Byte key) {
    	if(key != null) {
        	for(ButtonTypeEnum buttonTypeEnum : ButtonTypeEnum.values()) {
        		if(buttonTypeEnum.key.equals(key)) {
        			return buttonTypeEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
