package com.hoolink.sdk.bo.device;

import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-27 11:53
 * @Description
 */
@Data
public class ExternalSyncFilterListBO {

    /*** 同步中的列表 */
    private List<ExternalSyncingBO> syncingList;

    /*** 离线的列表 */
    private List<ExternalSyncingBO> offlineList;
}
