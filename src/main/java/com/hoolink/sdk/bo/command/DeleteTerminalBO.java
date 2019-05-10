package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author chenzhixiong
 * @date 2019/3/14 16:48
 */
@Data
public class DeleteTerminalBO {
   @NotBlank(message = "ti不能为空")
   private String tid;
}
