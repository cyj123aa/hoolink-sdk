package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName PlayControlBO
 * @Author huyaxi
 * @DATE 2019/5/20 13:08
 */
@Data
public class PlayControlBO {
    @NotNull
    private Long id;
    @NotNull
    private Boolean play;
}
