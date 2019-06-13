package com.hoolink.sdk.enums.alarm;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhangxin
 * @date 2019/6/12
 */
@Getter
@AllArgsConstructor
public enum LightFaultEnum {

    /*** 离线 */
    OFFLINE("offline"),
    /*** ACK故障 */
    ACK_FAULT("ack_fault"),
    ;

    /*** code */
    private String code;

}
