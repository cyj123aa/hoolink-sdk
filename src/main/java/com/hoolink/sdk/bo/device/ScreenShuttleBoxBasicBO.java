package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/23 20:36
 */
@Data
public class ScreenShuttleBoxBasicBO implements Serializable {
    private static final long serialVersionUID = -6817785065195122554L;
    
    /*** obs或者txt的ID */
    private Long obsTxtId;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件名称 */
    private String fileName;

    /*** 文件扩展名 */
    private String fileExtName;
}
