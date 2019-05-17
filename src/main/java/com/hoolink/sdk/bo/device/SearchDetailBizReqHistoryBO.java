package com.hoolink.sdk.bo.device;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 朱礼
 * @Date 2019/5/17
 * @Desc
 */
@Data
public class SearchDetailBizReqHistoryBO implements Serializable {
    private static final long serialVersionUID = 316593112281403429L;

    /** 操作记录id*/
    @NotNull(message = "bizId不能为空")
    private Long bizId;

    /** 状态 true: 成功，false：失败*/
    private Boolean cmdResult;
}
