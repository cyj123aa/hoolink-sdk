package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName RealPlayFileBO
 * @Author huyaxi
 * @DATE 2019/5/31 15:45
 */
@Data
public class RealPlayFileBO {
    /**
     * 设备的mac地址
     */
    @NotNull
    private String param1;
    /**
     * xxx,打卡成功。
     * 文本信息message
     */
    @NotNull
    private String param4;
}
