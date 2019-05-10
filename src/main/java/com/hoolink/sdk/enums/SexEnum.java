package com.hoolink.sdk.enums;
/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public enum SexEnum {
    /*** 性别 */
    SEX_UNKNOWN(0,"未知"),
    SEX_MALE(1,"男"),
    SEX_MADAM(2,"女"),
    ABNORMAL_DATA(-1,"异常数据"),
    ;

    SexEnum(Integer key,String value){
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

    public static SexEnum getValue(Integer key){
        return getValue(key);
    }
    public static String getSexValue(String key){
        for (SexEnum sexEnum:SexEnum.values()){
            if(sexEnum.key.equals(key)){
                return sexEnum.value;
            }
        }
        return SexEnum.ABNORMAL_DATA.value;

    }

    public static SexEnum getDesc(Integer key){
        for (SexEnum sexEnum:SexEnum.values()){
            if(sexEnum.getKey() - key == 0){
                return sexEnum;
            }
        }
        return SexEnum.ABNORMAL_DATA;
    }

}
