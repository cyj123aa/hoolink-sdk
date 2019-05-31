package com.hoolink.sdk.enums;

/**
 * 下拉框级联层次
 * @author lijunling
 *
 * @date 2019/05/27 11:42
 */
public enum ExcelDropDownTypeEnum {
	/**
	 *一级
	 */
	LEVEL_ONE(1, "一级"),
	/**
	 *二级（级联下拉框）
	 */
	LEVEL_TWO_MORE(2, "二级以上");
	
    private Integer key;
    private String value;
    
    ExcelDropDownTypeEnum(Integer key, String value){
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
}
