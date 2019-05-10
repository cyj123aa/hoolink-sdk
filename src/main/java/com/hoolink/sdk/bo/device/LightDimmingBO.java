package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XuBaofeng.
 * @date 2019-04-04 10:07.
 * <p>
 * description: 单灯调光BO
 */
@Data
public class LightDimmingBO implements Serializable {

    private static final long serialVersionUID = 5069297684075695128L;
    /*** 单灯ID */
    private List<Long> lightIds;
    /*** 调光值 */
    private Integer dimming;

}
