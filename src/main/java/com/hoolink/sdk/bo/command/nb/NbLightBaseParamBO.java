package com.hoolink.sdk.bo.command.nb;

import lombok.Data;

import java.util.List;

/**
 * @author 朱礼
 * @Date 2019/5/8
 * @Desc
 */
@Data
public class NbLightBaseParamBO {
    List<NbLightCmdBO> nbLightCmdBOList;
    /**
     * 调光值
     */
    private Integer  dimmingValue;

}
