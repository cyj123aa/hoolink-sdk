package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/24 10:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScreenFileShuttleBoxBasicBO implements Serializable {
    private static final long serialVersionUID = -4581549433875931117L;
    
    /*** 文件类型+obs或者txt的ID */
    private String value;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件名称 */
    private String title;

    /*** 文件扩展名 */
    private String type;

    /*** obs或者txt的ID */
    private Long obsTxtId;

    /*** 创建时间 */
    private Long created;

    /*** 顺序 */
    private Integer fileOrder;

    /*** 文件大小，单位：B */
    private Long fileSize;
}
