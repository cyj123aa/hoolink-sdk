package com.hoolink.sdk.bo.websocket;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xuli
 * @Date: 2019/7/8 15:20
 */
@Data
public class ManageSocketBO implements Serializable {

    private Long userId;

    private String message;
}
