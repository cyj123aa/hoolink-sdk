package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/6/12
 * @Desc
 */
@Data
public class OrderProcessBO implements Serializable {
    private static final long serialVersionUID = 7106140286972407562L;

    /** 工单流程内容*/
    private String content;

    /** 流程处理时间 */
    private Long handleTime;
}
