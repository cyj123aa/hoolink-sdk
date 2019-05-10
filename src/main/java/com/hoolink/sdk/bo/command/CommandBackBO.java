package com.hoolink.sdk.bo.command;


import lombok.Data;

/**
 * @ClassName CommandBack
 * @Author huyaxi
 * @DATE 2019/4/15 17:49
 */
@Data
public class CommandBackBO<T> {
    /**
     *  指令下行msg
     */
    private String message;
    /**
     *  指令下行状态
     */
    private Boolean success;

    /**
     * 下行响应数据
     */
    private T data;

    public static CommandBackBO response(String message, boolean success){
        return response(message, success,null);
    }

    public static CommandBackBO response(String message,boolean success,Object data){
        CommandBackBO responseBO = new CommandBackBO();
        responseBO.setMessage(message);
        responseBO.setSuccess(success);
        responseBO.setData(data);
        return responseBO;
    }
}
