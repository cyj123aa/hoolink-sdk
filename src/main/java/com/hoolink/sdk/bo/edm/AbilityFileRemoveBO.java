package com.hoolink.sdk.bo.edm;

import lombok.Data;

import java.util.List;

/**
 * @Author by lixiaoran
 * @date 2019-06-20
 */
@Data
public class AbilityFileRemoveBO {
    /**
     * obsId
     */
    private List<Long> obsIds;
    /**
     * minioIds
     */
    private List<Long> minioIds;

    private Long userId;
}
