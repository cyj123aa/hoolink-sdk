package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author zhouyun
 * @date 2019/7/12 15:23
 * @desc
 **/
@Data
public class SoundBizReqHistoryParamBO implements Serializable {

    private static final long serialVersionUID = 7615988468012266395L;
    /**操作类型*/
    private String operationType;

    /**操作内容*/
    private String content;

    /** 指令码*/
    private String cmdCode;

    /** 设备列表*/
    private Map<Long, List<CmdResultBO>> deviceMap;

    /**创建者id*/
    private Long creator;

    /**成功总数*/
    private Integer successNum;

    /**操作失败设备数*/
    private Integer failNum;

    /** 创建时间*/
    private Long created;

    /**项目id*/
    private Long projectId;

    /** random 音响特用属性 */
    private String random;
}
