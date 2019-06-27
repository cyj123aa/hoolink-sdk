package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-24 17:07
 * @Description
 */
@Data
public class ExternalAutoSynchParamBO implements Serializable {
    /*** 集中器ID */
    private List<Long> externalIdList;
    /*** 创建者ID */
    private Long creator;
}
