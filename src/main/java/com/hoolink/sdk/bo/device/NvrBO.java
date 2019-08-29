package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/8/29 11:21
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NvrBO extends DeviceManagerBO implements Serializable {
    private static final long serialVersionUID = 5114129742665361393L;

    /*** NVR ID */
    private Long id;

    /*** NVR IP */
    private String nvrIp;

    /*** NVR 端口 */
    private Integer nvrPort;

    /*** NVR 账户 */
    private String nvrAccount;

    /*** NVR 密码 */
    private String nvrPassword;
    
}
