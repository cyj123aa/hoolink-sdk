package com.hoolink.sdk.bo.mdc;

import lombok.Data;

import java.util.Collection;

/**
 * @Author: tonghao
 * @Date: 2019/6/17 20:35
 */
@Data
public class PushRequestBO {

    private String message;
    private Collection<String> jPushList;
}
