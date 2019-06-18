package com.hoolink.sdk.bo.device;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 20:26
 * @Description
 */
@Data
public class DmxMediaBO implements Serializable {

    /*** 文件名称 */
    private String fileName;

    /*** 文件ID */
    private Long fileId;

    /*** 文件扩展名 */
    private String fileExtName;

    /*** 文件大小 */
    private String fileSize;

    /*** 上传时间 */
    private Long uploadTime;

    /*** 上传人员 */
    private String userName;

    /*** 文件类型：2多媒体 */
    private Byte fileType;

    /*** 文件状态：1：上传中，2：成功，3：失败 */
    private Byte fileStatus;

}
