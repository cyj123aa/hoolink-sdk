package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/7/3 12:07
 */
@Data
public class DownLoadSengMsgToMqBO {

    /**
     * 文件下载的url
     */
   private String url;
    /**
     * 总的数量
     */
   private Long total;
    /**
     * 当前打包的数量
     */
   private Long currentTotal;
    /**
     * 总的文件的大小
     */
   private Long size;
    /**
     * 打包到当前文件的大小
     */
   private Long currentSize;

   private Long userId;
}
