package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-05-18 19:20.
 * <p>
 * description:
 */
@Data
public class StrategyLightBO implements Serializable {
    private static final long serialVersionUID = 3134692051407112749L;

    /*** 所有设备 */
    private List<GroupBO> allDevice;

    /*** 已选设备 */
    private List<GroupBO> beSelectDevice;

}