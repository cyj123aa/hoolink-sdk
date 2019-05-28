package com.hoolink.sdk.enums.edm;

/**
 * @author chenzhixiong
 * @date 2019/5/28 9:46
 * 日志操作类型枚举
 */
public enum EdmOperateTypeEnum {
    READ_FILE((byte)1,"查看文件"),
    DELETE_FILE((byte)2,"删除文件"),
    UPLOAD_FILE((byte)3,"上传文件"),
    OUTPUT_FILE((byte)4,"输出文件"),
    UPDATE_FILE((byte)5,"编辑文件"),
    MOVE_FILE((byte)6,"移动文件"),
    DOWNLOAD_FILE((byte)7,"下载文件"),
    ;

    private Byte key;
    private String code;

    public static String getCode(Byte key) {
        for (EdmOperateTypeEnum repertory : EdmOperateTypeEnum.values()) {
            if (repertory.key.equals(key)) {
                return repertory.code;
            }
        }
        return null;
    }


    EdmOperateTypeEnum(Byte key, String code) {
        this.key = key;
        this.code = code;
    }

    public void setKey(Byte key) {
        this.key = key;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getKey() {
        return key;
    }

    public String getCode() {
        return code;
    }
}
