package com.hoolink.sdk.enums;

/**
 * @author lijunling
 * @description 公司
 * @date 2019/05/15 18:54
 */
public enum CompanyEnum {
	HULING(1, "互灵"),
	JINGRI(2, "晶日");
	
    private Integer key;
    private String value;
    
    CompanyEnum(Integer key, String value){
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
        	for(CompanyEnum companyEnum : CompanyEnum.values()) {
        		if(companyEnum.key.intValue() == key.intValue()) {
        			return companyEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
