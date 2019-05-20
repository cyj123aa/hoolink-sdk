package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/13
 * @Desc
 */
@Data
public class BizReqHistoryBO implements Serializable {
    private static final long serialVersionUID = -3409696825163498189L;

    /**主键id*/
    private Long id;

    /**设备型号id*/
    private Long deviceTypeId;

    /**操作类型*/
    private String operationType;

    /**操作内容*/
    private String content;

    /**操作结果(1:成功,0:失败)*/
    private Boolean cmdResult;

    /**项目id*/
    private Long projectId;

    /**播放时长*/
    private Integer duration;

    /**操作设备总数*/
    private Integer totalNum;

    /**操作失败设备数*/
    private Integer failNum;

    /**创建者id*/
    private Long creator;

    /**创建时间*/
    private Long created;

    /** 操作人*/
    private String account;

}