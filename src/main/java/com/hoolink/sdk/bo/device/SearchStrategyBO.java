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
    /*** 项目ID */
    private Long projectId;

    /*** 场景项ID */
    private Long itemId;

    /*** 设备型号Id */
    private Long subTypeId;
}
