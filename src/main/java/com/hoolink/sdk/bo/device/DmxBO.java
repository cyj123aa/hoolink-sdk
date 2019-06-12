package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/12 9:03
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DmxBO extends DeviceManagerBO implements Serializable {
    private static final long serialVersionUID = -4536014306084863382L;
    
    /*** 联机数 */
    private Integer onlineNodeNum;

    /*** 控制器总数 */
    private Integer controllerNum;

    /*** 当前播放节目ID */
    private Integer programConfigId;

    /*** 宽度 */
    private Integer width;

    /*** 高度 */
    private Integer height;
}
