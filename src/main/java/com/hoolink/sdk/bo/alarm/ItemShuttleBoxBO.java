package com.hoolink.sdk.bo.alarm;

import com.hoolink.sdk.bo.device.DeviceShuttleBoxBO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/6/13 10:11
 */
@Data
public class ItemShuttleBoxBO implements Serializable {
    private static final long serialVersionUID = 7680889212926649222L;

    /*** 报警项信息 */
    private List<AlarmConfigItemBO> alarmConfigItems;

    /*** 穿梭框信息 */
    private DeviceShuttleBoxBO deviceShuttleBox;

}
