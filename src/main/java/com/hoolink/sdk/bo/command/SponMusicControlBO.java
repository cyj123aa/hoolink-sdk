package com.hoolink.sdk.bo.command;

import com.hoolink.sdk.enums.MusicControlEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 17:12
 */
@Data
public class SponMusicControlBO {
   private MusicControlEnum taskCommand;
   @NotBlank(message = "taskId不能为空")
   private String taskId;
}
