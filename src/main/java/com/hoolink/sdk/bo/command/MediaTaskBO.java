package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName MediaTaskBO
 * @Author huyaxi
 * @DATE 2019/4/15 17:36
 */
@Data
public class MediaTaskBO {
    @NotBlank(message = "rand不能为空")
    private String rand;
    @NotBlank(message = "mediumIds不能为空")
    private String mediumIds;
    @NotBlank(message = "playMode不能为空")
    private String playMode;
    @NotBlank(message = "vol不能为空")
    private String vol;
    @NotBlank(message = "duration不能为空")
    private String duration;
    @NotBlank(message = "dialNos不能为空")
    private String dialNos;

}
