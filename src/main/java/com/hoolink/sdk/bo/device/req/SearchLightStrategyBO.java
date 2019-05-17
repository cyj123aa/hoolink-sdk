package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SearchLightStrategyBO extends PageParamBO implements Serializable {

    private static final long serialVersionUID = 2619474711317284772L;

    /*** 项目ID */
    @NotNull(message = "项目ID不允许为空")
    private Long projectId;

    /*** 策略名称，模糊匹配 */
    private String fuzzyName;

    /*** 策略模式 */
    private Byte pattern;

    /*** 策略模式 */
    private List<Byte> patterns;

    /*** 策略状态 */
    private Boolean status;

    /*** 不包含的ID */
    private Long outId;
}
