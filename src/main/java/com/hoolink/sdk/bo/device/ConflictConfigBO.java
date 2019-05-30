package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author <a herf="mailto:yanwu0527@163.com">XuBaofeng</a>
 * @date 2019-05-30 15:30.
 * <p>
 * description:
 */
@Data
public class ConflictConfigBO implements Serializable {
    private static final long serialVersionUID = -3678880549893927748L;

    /*** 清单ID */
    private Long configId;

    /*** 清单名称 */
    private String configName;

    /*** 清单模式: 1.每天 2.自定义 3.特殊日期 */
    private Integer pattern;

    /*** 特殊日期 */
    private List<LocalDate> dates;

    /*** 自定义周 */
    private List<Byte> weeks;

    /*** 清单开始时间 */
    private LocalTime timingStart;

    /*** 清单结束时间 */
    private LocalTime timingEnd;

}
