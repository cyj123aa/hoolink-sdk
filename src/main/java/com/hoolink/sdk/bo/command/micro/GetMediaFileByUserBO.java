package com.hoolink.sdk.bo.command.micro;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author zhouyun
 * @date 2019/8/23 16:01
 * @desc
 **/
@Data
public class GetMediaFileByUserBO implements Serializable {

    private static final long serialVersionUID = -381449438555051995L;
    /** 登录用户名 （必填）*/
    private String loginName;
    /** 文件类型 1:私有文件 2:公有文件 （必填）*/
    private String privateState;
    /** 输入的查询信息(可查询的字段：媒体文件名)(可模糊查询，为空查询所有) */
    private String condition;
    /** 当前页数 */
    private String page;
    /** 每页数据条数 */
    private String perPage;
    /** 当前时间 */
    private Long time;
}
