package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/24 10:44
 */
@Data
public class ScreenFileShuttleBoxBasicBO implements Serializable {
    private static final long serialVersionUID = -4581549433875931117L;
    
    /*** obs或者txt的ID */
    private Long value;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件名称 */
    private String title;

    /*** 文件扩展名 */
    private String type;
}
