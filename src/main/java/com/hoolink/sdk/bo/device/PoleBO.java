package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author XuBaofeng.
 * @date 2019-04-02 9:33.
 * <p>
 * description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PoleBO extends DeviceManagerBO {
    
    private static final long serialVersionUID = -4703953940979127393L;

    /*** 杆高 */
    private Short poleHeight;

    /*** 叉数 */
    private Short forkNum;

}
