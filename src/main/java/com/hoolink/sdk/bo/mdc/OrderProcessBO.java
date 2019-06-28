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

    /**
     * 执行状态  1 灰  未执行步骤 2绿  成功 3红  错误步骤    4 蓝色  当前步骤
     */
    private Integer notPerformed;

    /**
     * 操作人
     */
    private Long useId;
}
