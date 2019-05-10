package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.List;

/**
 * @author wangdong
 * @date 2019/3/20 17:53
 */
@Data
public class BatchSetVolumeBO {

    private List<Long> soundBoxIds;

    private Integer volume;
}
