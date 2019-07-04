package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuBaofeng.
 * @date 2019-05-21 16:30.
 * <p>
 * description:
 */
@Data
public class SearchStrategyBO implements Serializable {

    private static final long serialVersionUID = 8570528798270202145L;

    /*** 策略ID */
    private Long id;

    /*** 项目ID */
    private Long projectId;

    /*** 场景项ID */
    private Long itemId;

    /*** 设备型号Id */
    private Long subTypeId;
}
