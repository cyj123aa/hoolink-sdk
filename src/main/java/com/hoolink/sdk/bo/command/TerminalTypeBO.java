package com.hoolink.sdk.bo.command;

import lombok.Data;

/**
 * @author chenzhixiong
 * @date 2019/3/20 10:19
 */
@Data
public class TerminalTypeBO {

    /**
     * 该字段标识终端类型
     * 1 ip广播  2 音箱   3 一键呼救
     */
    private String type;
}
