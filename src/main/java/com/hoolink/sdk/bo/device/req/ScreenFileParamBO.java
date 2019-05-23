package com.hoolink.sdk.bo.device.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/5/23 14:23
 */
@Data
public class ScreenFileParamBO implements Serializable {

    private static final long serialVersionUID = 7408775767864784015L;

    /*** 项目ID */
    private Long projectId;

    /*** 文件名称 */
    private String fileName;

    /*** 文件类型 */
    private String fileType;
}
