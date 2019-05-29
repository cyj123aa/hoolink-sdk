package com.hoolink.sdk.bo.edm;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

/**
 * @description: 资源
 * @author: WeiMin
 * @date: 2019-05-29
 **/
@Data
public class ResourceParamBO {
    private String code;

    private List<Long> positionList;
}
