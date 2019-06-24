package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/10 19:52
 */
@Data
public class AlarmConfigProjectBO implements Serializable {
    private static final long serialVersionUID = 8969720135335821168L;

    /*** 阈值记录ID */
    private Long id;

    /*** 报警项ID */
    @NotNull(message = "报警项ID不能为空")
    private Long itemId;

    /*** 上界 */
    private Double upperBound;

    /*** 下界 */
    private Double lowerBound;
}
