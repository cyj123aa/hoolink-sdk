package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author : chenzb
 * @Description : 设备升级传参
 * @date : Created on 2019/4/25 16:30
 */
@Data
public class FirmwareUpgradeBO {

    /*** 升级目标版本 */
    private String dstVersion;

    /*** 升级类型 0 高版本升级 1 强制升级 */
    private Byte type;

    /*** 升级设备MAC与源版本 */
    private Map<String,String> macSrcVersionMap;

    /*** 升级包 */
    private Byte[] files;
}
