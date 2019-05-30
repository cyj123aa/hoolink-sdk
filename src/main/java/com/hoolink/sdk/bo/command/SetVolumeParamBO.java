package com.hoolink.sdk.bo.command;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @version V1.0
 * @classname:SetVolumeParamBO
 * @author: xiaolei.yang
 * @date: 2019/5/22 14:50
 **/
@Data
public class SetVolumeParamBO {
    /**
     * 终端ID
     */
    @NotEmpty(message = "tids不能为空")
    private Long tids;
    /**
     * 音量
     */
    private String vol;

    public Long getTids() {
        return tids;
    }

    public void setTids(Long tids) {
        this.tids = tids;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }
}
