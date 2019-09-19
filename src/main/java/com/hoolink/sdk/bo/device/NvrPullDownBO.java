package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/9/2 9:57
 */
@Data
public class NvrPullDownBO implements Serializable {
    private static final long serialVersionUID = -1249288785169855109L;

    /*** nvr ID */
    private Long nvrId;

    /*** nvr 名称 */
    private String nvrName;

    /*** NVR IP */
    private String nvrIp;

    /*** NVR 端口 */
    private Integer nvrPort;

    /*** NVR 账户 */
    private String nvrAccount;

    /*** NVR 密码 */
    private String nvrPassword;
}
