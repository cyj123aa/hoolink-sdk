package com.hoolink.sdk.bo.command.camera;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
@Data
public class HlsCameraBO extends PageParamBO {
    private Long projectId;
    private String deviceName;

}
