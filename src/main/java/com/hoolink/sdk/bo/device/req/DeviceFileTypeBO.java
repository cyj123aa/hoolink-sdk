package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/22 14:04
 */
@Data
public class DeviceFileTypeBO implements Serializable {
    private static final long serialVersionUID = 4655119946739289190L;

    /*** obs或者txt的ID */
    private Long obsTxtId;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件位于播放清单的顺序 */
    private Integer fileOrder;
}
