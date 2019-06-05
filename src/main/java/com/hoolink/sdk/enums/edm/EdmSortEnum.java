package com.hoolink.sdk.enums.edm;

/**
 * @Author : lys
 * @Date : 2019/6/5 17:35
 * @Instructions : edm文件列表排序规则枚举
 */
public enum EdmSortEnum {
    /**
     * 升序排序
     */
    ASCENDING_ORDER(1, "ASC"),

    /**
     * 降序排序
     */
    DESCENDING_ORDER(2, "DESC");

    private Integer key;
    private String code;

    EdmSortEnum(Integer key, String code) {
        this.key = key;
        this.code = code;
    }

    public static String getCode(Integer key) {
        for (EdmSortEnum repertory : EdmSortEnum.values()) {
            if (repertory.key.equals(key)) {
                return repertory.code;
            }
        }
        return null;
    }

    public static final EdmSortEnum getByType(Integer type) {
        for (EdmSortEnum edmSortEnum : EdmSortEnum.values()) {
            if (edmSortEnum.key.equals(type)) {
                return edmSortEnum;
            }
        }
        return null;
    }

    public Integer getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }
}
