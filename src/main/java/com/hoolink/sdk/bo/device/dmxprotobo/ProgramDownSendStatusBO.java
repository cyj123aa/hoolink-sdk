package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-20 10:52
 * @Description
 */
@Data
public class ProgramDownSendStatusBO implements Serializable {

    /*** 节目编号*/
    private String programNo;

    /*** 下发成功的节点列表*/
    private List<String> successNodeList;

    /*** 下发失败的节点列表*/
    private List<String> failNodeList;
}
