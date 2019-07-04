package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 16:51
 * @Description
 */
@Data
public class ProgramDelBO extends TargetBO implements Serializable {
    @JSONField(name="ProgramsBean")
    private List<ProgramBO> programBeans;

    @JSONField(name="Programs")
    private List<String> programs;
}
