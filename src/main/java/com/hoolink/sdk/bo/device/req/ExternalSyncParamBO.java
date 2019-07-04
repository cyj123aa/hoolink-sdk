package com.hoolink.sdk.bo.device.req;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-26 16:38
 * @Description
 */
@Data
public class ExternalSyncParamBO implements Serializable{
    /*** 集中器ID列表 */
    private List<Long> ids;
    /*** 同步操作者ID */
    private Long creator;
}
