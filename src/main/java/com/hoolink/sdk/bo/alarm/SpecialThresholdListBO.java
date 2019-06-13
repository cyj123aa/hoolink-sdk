package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/6/12 14:56
 */
@Data
public class SpecialThresholdListBO implements Serializable {
    private static final long serialVersionUID = 1941749731640251215L;

    /*** 记录ID */
    private Long id;
    
    /*** 特殊阈值类型 */
    private Long deviceType;

    /*** 说明 */
    private String configName;

    /*** 设备数量 */
    private Long deviceNum;

    /*** 创建人 */
    private String creator;

    /*** 创建时间 */
    private Long created;
    
}
