package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;

import com.hoolink.sdk.bo.device.ProjectParamBO;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-11 20:24
 * @Description
 */
@Data
public class DmxFileParamBO extends ProjectParamBO implements Serializable {

    /*** 节目ID */
    private Long programId;

    /*** 文件名称 */
    private String fileName;

    /*** 文件状态：1：上传中，2：成功，3：失败 */
    private Byte fileStatus;
}
