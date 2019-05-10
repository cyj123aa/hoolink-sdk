package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.command.UpgradeStateEnum;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class MacVersionBO {
    private String mac;
    private String version;
    private UpgradeStateEnum upgradestate;

}
