package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @ClassName RealCastBO
 * @Author huyaxi
 * @DATE 2019/4/15 17:36
 */
@Data
public class RealCastBO {
    /**
     * 输入端设备号码
     */
    private String caller;

    /**
     * 输出端设备号码
     */
    private String callee;

}
