package com.hoolink.sdk.bo.device;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-07-04 19:46
 * @Description
 */
@Data
public class ExternalSyncingListBO implements Serializable {

    /**
     * 是否全部过滤掉的状态，全部过滤掉为同步失败
     */
    private Boolean allSyncingFlag;

    /**
     * 过滤掉的集中器列表
     */
    private List<ExternalSyncingBO> externalSyncingList;
}
