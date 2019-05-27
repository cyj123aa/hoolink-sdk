package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName GetSoundBoxBO
 * @Author huyaxi
 * @DATE 2019/5/22 14:53
 */
@Data
public class GetSoundBoxBO implements Serializable {
    private Long projectId;
    private List<Long> deviceIds;
}
