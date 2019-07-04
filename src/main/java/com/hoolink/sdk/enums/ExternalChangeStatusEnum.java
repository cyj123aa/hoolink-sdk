package com.hoolink.sdk.enums;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 15:33
 * @Description
 */
public enum ExternalChangeStatusEnum {
    /*** 变更状态 */
    STATUS_NONE(0,"无"),
    STATUS_HAVE(1,"有");

    ExternalChangeStatusEnum(Integer key,String value){
        this.key = key;
        this.value = value;
    }

    private Integer key;
    private String value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        if (this == null){
            return "异常数据";
        }
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public static ExternalChangeStatusEnum getValue(Integer key){
        return getValue(key);
    }
    public static String getStatusValue(Integer key){
        for (ExternalChangeStatusEnum statusEnum:ExternalChangeStatusEnum.values()){
            if(statusEnum.key.equals(key)){
                return statusEnum.value;
            }
        }
        return ExternalChangeStatusEnum.STATUS_NONE.value;
    }
}
