package com.hoolink.sdk.bo.edm;

import lombok.Data;

/**
 * @description: edm下载信息推送
 * @author: WeiMin
 * @date: 2019-07-05
 **/
@Data
public class EdmDownloadBO {
    /**
     * 当前推送数据标志
     * 1：下载过程
     * 2：打包开始
     * 3：打包结束
     */
    private Integer currentFlag;
    /**
     * 下载总数
     */
    private Integer total;
    /**
     * 下载完成数
     */
    private Integer current;
    /**
     * 当前进度
     */
    private String progress;

    /**
     * 打包时长
     */
    private Float packTime;
}
