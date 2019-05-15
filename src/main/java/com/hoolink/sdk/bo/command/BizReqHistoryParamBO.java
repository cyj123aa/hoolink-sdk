package com.hoolink.sdk.bo.command;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/5/15
 * @Desc
 */
@Data
public class BizReqHistoryParamBO implements Serializable {
    private static final long serialVersionUID = 5276609512152857345L;

    /**设备型号id*/
    private Long deviceSubTypeId;

    /**操作类型*/
    private String operationType;

    /**操作内容*/
    private String content;

    /**播放时长*/
    private Integer duration;

    /** 指令码*/
    private String cmdCode;

    /** 设备列表*/
    private List<CmdResultBO> deviceList;

    /**创建者id*/
    private Long creator;

    /**成功总数*/
    private Integer successNum;

    /**操作失败设备数*/
    private Integer failNum;
}