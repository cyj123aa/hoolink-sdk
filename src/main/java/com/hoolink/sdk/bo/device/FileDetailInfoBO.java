package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.device.req.ScreenTxtBO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/23 14:14
 */
@Data
public class FileDetailInfoBO implements Serializable {
    private static final long serialVersionUID = -4564056966080174152L;

    /*** 文件名称 */
    private String fileName;

    /*** 文件扩展 */
    private String fileExtName;

    /*** 上传时间 */
    private Long uploadTime;

    /*** 上传人员ID */
    private Long userId;

    /*** 上传人员名称 */
    private String userName;

    /*** 文件类型：1文本，2多媒体 */
    private Byte fileType;

    /*** 多媒体文件链接 */
    private String fileUrl;

    /*** 文本信息 */
    private ScreenTxtBO screenTxtBO;
    
}
