package com.hoolink.sdk.bo.device;

import com.hoolink.sdk.enums.CheckDeviceMessageEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/5 11:57
 */
@Data
public class CheckErrorBO implements Serializable {

    private static final long serialVersionUID = -8898638378947895293L;
    
    /*** 物理地址 */
    private String mac;

    /*** 型号名称 */
    private String subTypeName;

    /*** 出错信息 */
    private List<CheckDeviceMessageEnum> messageEnumList;

}
