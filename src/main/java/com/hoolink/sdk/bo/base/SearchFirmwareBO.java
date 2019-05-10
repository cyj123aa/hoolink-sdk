package com.hoolink.sdk.bo.base;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : lys
 * @Date : 2019/4/23 11:24
 * @Instructions :
 */
@Data
public class SearchFirmwareBO extends PageParamBO implements Serializable {
    private static final long serialVersionUID = -1932596385073183262L;

    /**
     * 设备型号（选填）
     */
    private String version;

    /**
     * 关联device_sub_type设备型号表外键（选填）
     */
    private Long deviceSubTypeId;

    /**
     * 关联device_type设备类型表外键（选填）
     */
    private Long deviceTypeId;

}
