package com.hoolink.sdk.bo.command;

import com.hoolink.sdk.enums.InstructionCodeType;
import lombok.Data;

/**
 * @author 朱礼
 * @Date 2019/4/15
 * @Desc 下行指令封装
 */
@Data
public class CmdParamBO<T> {

    /**
     * 指令协议类型：由知识库定义
     * 主要区分不同设备不同协议组装
     */
    private InstructionCodeType instructionCodeType;

    /**
     * 下行指令码：由知识库定义
     */
    private String instructionCodeConsts;

    private T cmdData;

    private Class tClazz;

    public void setCmdData(T cmdData) {
        this.cmdData = cmdData;
        this.tClazz = cmdData.getClass();
    }
}
