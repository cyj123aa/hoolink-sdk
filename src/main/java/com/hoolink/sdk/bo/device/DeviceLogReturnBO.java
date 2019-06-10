package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/26 13:28
 */
@Data
public class DeviceLogReturnBO implements Serializable {
    private static final long serialVersionUID = -5998564872338547634L;

    /*** ID */
    private Long id;

    /*** 设备ID */
    private Long deviceId;

    /*** 成功、失败 */
    private Boolean resultName;

    /*** 详情 */
    private String content;

    /*** 创建时间 */
    private Long created;

    /*** 操作人 */
    private Long creator;


}
