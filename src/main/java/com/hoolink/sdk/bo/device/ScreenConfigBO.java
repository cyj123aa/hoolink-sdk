package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.bo.ability.ObsBO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/29 11:28
 */
@Data
public class ScreenConfigBO implements Serializable {
    private static final long serialVersionUID = 5105803810592713796L;

    /*** 显示屏ID */
    private Long id;

    /*** 亮度 */
    private Integer screenBrightness;

    /*** 文件数量 */
    private Integer fileNum;

    /*** 清单名称 */
    private String configName;

    /*** 清单状态 */
    private Integer deviceStatus;
}
