package com.hoolink.sdk.bo.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName PlayControlBO
 * @Author huyaxi
 * @DATE 2019/5/20 13:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayControlBO implements Serializable {
    @NotNull
    private Long id;
    @NotNull
    private Boolean play;
}
