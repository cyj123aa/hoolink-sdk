package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/23 17:39
 */
@Data
public class DeleteScreenFileBO implements Serializable {
    private static final long serialVersionUID = 3404203353971651372L;

    /*** 文件类型：1文本 2多媒体 */
    private Byte fileType;

    /*** 文件ID */
    private Long fileId;
}
