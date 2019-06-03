package com.hoolink.sdk.enums;

/**
 * 组织架构枚举类
 * @author lijunling
 *
 * @date 2019/05/22 20:02
 */
public enum DeptTypeEnum {
	/**
	 * 公司
	 */
	COMPANY((byte)1, "公司"),
	/**
	 * 部门
	 */
	DEPARTMENT((byte)2, "部门"),
	/**
	 * 小组
	 */
	TEAM((byte)3, "小组");
	
    private Byte key;
    private String value;
    
    DeptTypeEnum(Byte key, String value){
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
        	for(DeptTypeEnum deptTypeEnum : DeptTypeEnum.values()) {
        		if(deptTypeEnum.key.equals(key)) {
        			return deptTypeEnum.value;
        		}
        	}    		
    	}
    	return null;
    }
}
