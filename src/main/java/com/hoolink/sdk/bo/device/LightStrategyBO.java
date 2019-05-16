package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxin
 * @date 2019/5/15
 */
@Data
public class LightStrategyBO implements Serializable {

    private static final long serialVersionUID = -482159689763846931L;

    /*** 主键 */
    private Long id;
    /*** 项目ID */
    private Long projectId;
    /*** 名称 */
    private String name;
    /*** 描述 */
    private String description;
    /*** 重复模式 */
    private Byte pattern;
    /*** 策略状态 */
    private Boolean status;

    /*** 重复模式中 自定义和特殊日期 对应的值 */
    private List<LightStrategyCycleBO> cycles;
    /*** 策略项，按时间维度分 */
    private List<LightStrategyItemBO> items;
}
