package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

/**
 * @author : chenzb
 * @Description : 广播上行更新设备表传参的BO
 * @date : Created on 2019/4/12 17:51
 */
@Data
public class BroadcastUpUpdateParamBO {

    /**
     * 设备id集合
     */
    private List<Long> idList;

    /**
     * 运行状态
     */
    private Byte runStatus;

    /**
     * 设备最后操作时间
     */
    private Long lastTime;

    /**
     * 设备类型（12：itc , 13:spon）
     */
    private Long subTypeId;

}
