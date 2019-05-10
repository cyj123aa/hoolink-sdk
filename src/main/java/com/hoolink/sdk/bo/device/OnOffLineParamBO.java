package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.DeviceTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wm on 2018/5/9.
 * 设备上下线的参数封装
 */
@Data
public class OnOffLineParamBO<T> implements Serializable {
    private static final long serialVersionUID = -6636867849462662417L;

    private String channelNo;
    /*** 公共字段 */
    private T content;
    /*** 设备类型 */
    private DeviceTypeEnum deviceType;

}
