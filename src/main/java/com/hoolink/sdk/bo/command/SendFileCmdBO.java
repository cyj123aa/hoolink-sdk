package com.hoolink.sdk.bo.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : lys
 * @Date : 2019/4/24 13:16
 * @Instructions :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendFileCmdBO {

    /*** 文件名称 */
    private String fileName;

    /*** 文件URL */
    private String fileUrl;
}
