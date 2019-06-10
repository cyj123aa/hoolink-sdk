package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName ChangeTaskVolumeBO
 * @Author huyaxi
 * @DATE 2019/5/23 17:37
 */
@Data
public class ChangeTaskVolumeBO implements Serializable {
    /**
     * 清单ID
     */
    @NotNull
    private Long id;

    /**
     * 实时音量
     */
    @NotNull
    private Integer volume;
}
