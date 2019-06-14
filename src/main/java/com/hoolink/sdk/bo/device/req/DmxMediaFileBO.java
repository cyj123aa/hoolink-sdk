package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;

import lombok.Data;

/**
 * @author zhangyy
 * @date 2019/5/22 14:04
 */
@Data
public class DmxMediaFileBO implements Serializable {
    /*** obs或者txt的ID */
    private Long obsId;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件位于播放清单的顺序 */
    private Integer fileOrder;

    /*** 文件名称 */
    private String fileName;
}
