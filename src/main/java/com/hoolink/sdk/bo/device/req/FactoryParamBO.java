package com.hoolink.sdk.bo.device.req;

import com.hoolink.sdk.param.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wangdong
 * @date 2019/4/30 15:43
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FactoryParamBO extends PageParam implements Serializable {
    private static final long serialVersionUID = -5304987855615244801L;

    private String factoryName;
}
