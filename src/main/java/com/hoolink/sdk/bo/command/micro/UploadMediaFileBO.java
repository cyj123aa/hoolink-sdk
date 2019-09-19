package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/23 14:20
 * @desc
 **/
@Data
public class UploadMediaFileBO implements Serializable {

    private static final long serialVersionUID = 5448297143879747106L;
    @NotBlank(message = "登录用户名不能为空")
    private String loginName;
    @NotBlank(message = "文件名不能为空")
    private String fileName;
    /** 0:不转码;32:转码成32kbps;64:转换成64kbps;128:转换成128kbps码率的文件 */
    @NotBlank(message = "文件转换码率不能为空")
    private String fileCode;
    /** 0:不覆盖;1:覆盖 */
    @NotBlank(message = "已经存在的文件是否覆盖标志位不能为空")
    private String bestRowState;
    /** 1:私有文件;2:公共文件 */
    @NotBlank(message = "文件类型不能为空")
    private String privateState;
    @NotBlank(message = "客户端IP不能为空")
    private String fileSrcIp;
    @NotBlank(message = "客户端MAC不能为空")
    private String fileSrcMac;
    @NotBlank(message = "文件路径不能为空")
    private String path;
    /** 当前时间 */
    private Long time;
}
