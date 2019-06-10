package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @Author: tonghao
 * @Date: 2019/6/3 17:36
 */
@Data
public class NbLightBO extends DeviceManagerBO{

    /** 模组编号 */
    private String moduleNo;

    /*** 灯杆mac */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;
}
