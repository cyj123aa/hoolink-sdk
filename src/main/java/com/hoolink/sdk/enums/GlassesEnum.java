package com.hoolink.sdk.enums;
/**
 * @author XuBaofeng.
 * @date 2018-12-27 10:00.
 * <p>
 * description:
 */
public enum GlassesEnum {
    /*** */
    GLASS_UNKNOWN(0,"未知"),
    GLASS_YES(1,"是"),
    GLASS_NO(2,"否"),
    ABNORMAL_DATA(-1,"异常数据"),
    ;
    private Integer key;
    private String value;

    GlassesEnum(Integer key,String value){
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
        if (this == null){
            return "异常数据";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static GlassesEnum getDesc(Integer key){
        for (GlassesEnum glassesEnum:GlassesEnum.values()){
            if(glassesEnum.getKey() - key == 0){
                return glassesEnum;
            }
        }
        return GlassesEnum.ABNORMAL_DATA;
    }
}
