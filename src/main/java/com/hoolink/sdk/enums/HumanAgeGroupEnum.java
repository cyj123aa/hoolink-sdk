package com.hoolink.sdk.enums;
/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public enum HumanAgeGroupEnum {
    /***群体*/
    AGE_GROUP_INFANT(1,"婴幼儿"),
    AGE_GROUP_CHILD(2,"儿童"),
    AGE_GROUP_YOUNGSTER(3,"少年"),
    AGE_GROUP_ADOLESCENT(4,"青少年"),
    AGE_GROUP_YOUTH(5,"青年"),
    AGE_GROUP_PRIME(6,"壮年"),
    AGE_GROUP_MIDLIFE(7,"中年"),
    AGE_GROUP_MIDAGE(8,"中老年"),
    AGE_GROUP_OLD(9,"老年"),
    ABNORMAL_DATA(-1,"异常数据"),
    ;

    HumanAgeGroupEnum(Integer key,String value){
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
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static HumanAgeGroupEnum getValue(Integer key){
        return getValue(key);
    }

    public static HumanAgeGroupEnum getDesc(Integer key){
        for (HumanAgeGroupEnum ageGroupEnum:HumanAgeGroupEnum.values()){
            if(ageGroupEnum.getKey() - key == 0){
                return ageGroupEnum;
            }
        }
        return HumanAgeGroupEnum.ABNORMAL_DATA;
    }

}
