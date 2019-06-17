package com.hoolink.sdk.bo.omc;

import com.hoolink.sdk.bo.rpc.PageParamBO;
import lombok.Data;

/**
 * @author chenyuejun
 */
@Data
public class ParamBO extends PageParamBO {

    private  Long projectId;
    /**
     * 1 近30天，2近半年，3全部
     */
    private Integer  type;

    private Long dayTime;

}
