package com.hoolink.sdk.enums.edm;

import com.hoolink.sdk.constants.FileTypeConstants;

/**
 * @author chenzhixiong
 * @date 2019/6/19 14:16
 */
public enum FileTypeEnum {
    PIECTURE(1,"图片", FileTypeConstants.PICTURE),
    VIDEO(2,"视频", FileTypeConstants.VIDEO),
    PPT(3,"PPT", FileTypeConstants.PPT),
    WORD(4,"word", FileTypeConstants.WORD),
    EXCEL(5,"excel", FileTypeConstants.ECXEL),
    CAD(6,"CAD", FileTypeConstants.CAD),
    PSD(7,"psd", FileTypeConstants.PSD),
    XMIND(8,"XMind", FileTypeConstants.XMIND),
    FILE(10,"文件", FileTypeConstants.UNKNOWNFILE),
    PDF(9,"PDF", FileTypeConstants.PDF),
    VOICE(11,"音频", FileTypeConstants.VOICE),
    TXT(12,"TXT", FileTypeConstants.TXT);
    private Integer key;
    private String code;
    private String[] type;

    FileTypeEnum(Integer key, String code, String[] type) {
        this.key = key;
        this.code = code;
        this.type = type;
    }

    public static Integer getCode(String fileExt) {
        for (FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {
            String[] types = fileTypeEnum.type;
            for (String type:types) {
                if(type.equals(fileExt)){
                   return fileTypeEnum.key;
                }
            }
        }
        return 10;
    }

}
