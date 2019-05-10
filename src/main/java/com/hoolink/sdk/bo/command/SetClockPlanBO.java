package com.hoolink.sdk.bo.command;

import lombok.Data;
import java.util.List;
import java.util.Map;

/**
 * @author 朱礼
 * @Date 2019/4/15
 * @Desc 照明场景 开关命令下发参数
 */
@Data
public class SetClockPlanBO {
    /**
     * 命令下发参数
     * key: 集中器MAC地址
     * value: 该集中器下所属单灯
     */
    private Map<String,List<LightPlanWorkBO>> external;

    private Long bizId;

}
