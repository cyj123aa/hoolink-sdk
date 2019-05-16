package com.hoolink.sdk.bo.command.camera;

import com.hoolink.sdk.bo.device.CameraBO;
import java.util.List;
import lombok.Data;


/**
 * @author chenzhixiong
 * @date 2019/1/9 10:08
 */
@Data
public class DeviceCameraPageInfo {
    private Long total;
    private List<CameraBO> list;


}
