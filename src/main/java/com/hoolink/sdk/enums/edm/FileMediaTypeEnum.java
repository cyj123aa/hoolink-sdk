package com.hoolink.sdk.enums.edm;


import com.hoolink.sdk.constants.FileTypeDetailsConstants;

/**
 * @author lixiaoran
 * @date 2019/6/19 14:16
 */
public enum FileMediaTypeEnum {
    /**
     * 文件类型jpg
     */
    JPG("image/jpeg",FileTypeDetailsConstants.PICTURE_JPG),
    /**
     * 文件类型jpeg
     */
    JPEG("image/jpeg",FileTypeDetailsConstants.PICTURE_JPEG),
    /**
     * 文件类型png
     */
    PNG("application/x-png",FileTypeDetailsConstants.PICTURE_PNG),
    /**
     * 文件类型gif
     */
    GIF("image/gif",FileTypeDetailsConstants.PICTURE_GIF),
    /**
     * 文件类型txt
     */
    TXT("text/plain",FileTypeDetailsConstants.TXT),
    /**
     * 文件类型doc
     */
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
