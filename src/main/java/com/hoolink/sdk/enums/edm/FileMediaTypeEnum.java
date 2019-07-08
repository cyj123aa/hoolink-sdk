package com.hoolink.sdk.enums.edm;


import com.hoolink.sdk.constants.FileTypeDetailsConstants;

/**
 * @author chenzhixiong
 * @date 2019/6/19 14:16
 */
public enum FileMediaTypeEnum {
    JPG("image/jpeg",FileTypeDetailsConstants.PICTURE_JPG),
    //todo 待测
    JPEG("image/jpeg",FileTypeDetailsConstants.PICTURE_JPEG),
    PNG("application/x-png",FileTypeDetailsConstants.PICTURE_PNG),
    GIF("image/gif",FileTypeDetailsConstants.PICTURE_GIF),

    TXT("text/plain",FileTypeDetailsConstants.TXT),
    DOC("application/msword",FileTypeDetailsConstants.WORD_DOC);



    private String mediaType;
    private String fileExtType;

    FileMediaTypeEnum(String mediaType, String fileExtType) {
        this.mediaType = mediaType;
        this.fileExtType = fileExtType;
    }

    /**
     * 根据文件类型获取对应的media上传的类型
     * @param fileExt
     * @return
     */
    public static String getMediaType(String fileExt) {
        for (FileMediaTypeEnum fileTypeEnum : FileMediaTypeEnum.values()) {
            if (fileTypeEnum.fileExtType.equals(fileExt)) {
                return fileTypeEnum.mediaType;
            }
        }
        //未知的使用默认下载的URl
        return "application/octet-stream";
    }
}
