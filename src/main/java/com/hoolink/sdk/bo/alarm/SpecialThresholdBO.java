package com.hoolink.sdk.bo.alarm;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/6/11 19:50
 */
@Data
public class SpecialThresholdBO implements Serializable {
    private static final long serialVersionUID = -735668604472527299L;
    
    /*** 主键ID */
    private Long id;

    /*** 项目ID */
    private Long projectId;

    /*** 说明 */
    private String configName;

    /*** 告警阈值项所属设备类型 */
    private Byte itemType;

    /*** 更新者 */
    private Long updator;

    /*** 更新时间 */
    private Long updated;

    /*** 创建者 */
    private Long creator;

    /*** 创建时间 */
    private Long created;

    /*** 设备ID集合 */
    private List<Long> deviceIds;

    /*** 阈值信息 */
    private List<AlarmConfigItemBO> alarmConfigItems;
}
