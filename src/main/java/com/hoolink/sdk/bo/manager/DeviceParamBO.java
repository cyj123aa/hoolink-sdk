package com.hoolink.sdk.bo.manager;

import javax.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

/**
 * @author : chenzb
 * @Description : 获取升级--匹配设备列表BO
 * @date : Created on 2019/4/20 15:31
 */

@Data
public class DeviceParamBO {

    /*** 设备型号id */

    private Long deviceSubTypeId;

    /*** 设备版本idList */
    private List<Long> versionIdList;

    /*** 项目idList */
    private List<Long> projectIdList;

    /*** 是否强制升级 (0正常升级,1强制回滚)*/
    private Byte upgradeTag;

}
