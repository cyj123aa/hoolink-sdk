package com.hoolink.sdk.enums.backBo;

import java.util.Objects;

/**
* @Description:    错误提示枚举类
* @Author:         badyu
* @CreateDate:     2018/7/5 15:43
* @UpdateUser:     badyu
* @UpdateDate:     2018/7/5 15:43
* @Version:        1.0
*/
public enum ResultMsgError {

    PARAM_NULL("PARAM_NULL","参数为空"),
    PARAM_ERROR("PARAM_ERROR","参数错误，请确认后再试"),
    SYSTEM_ERROR("SYSTEM_ERROR","系统异常，请联系管理员"),

    //用户管理
    USER_READ_LIST_ERROR("USER_0001","用户列表查询失败！"),
    USER_CREATE_ERROR("USER_0002","用户创建失败！"),
    USER_DELETE_ERROR("USER_0003","用户删除失败！"),
    USER_UPDATE_ERROR("USER_0003","用户修改失败！"),
    //配置中心
    CONFIG_CENTER_ALARM_CONFIG_ERROR("CONFIG_CENTER_001", "配置格式不正确，请检查"),
    //短信发送
    PHONE_FORMAT_ERROR("phone_format_error","手机号格式不正确，请重新输入"),
    PHONE_EXIST("phone_exist","该手机号码已被绑定"),
    PHONE_NOT_FOUND("phone_not_found","未绑定手机号,无法进行安全验证,请联系上级管理员进行密码重置"),
    VCODE_ERROR("vcode_error","验证码不正确，请重新输入"),
    VCODE_SUCCESS("vcode_success","验证码无误"),
    SEND_SMS_SUCCESS("send_sms_success","短信发送成功"),
    SEND_SMS_ERROR("send_sms_error","短信发送失败"),
    //command
    NETWORK_ERROR("NETWORK_ERROR","网络异常，请稍后再试"),
    DEVICE_BUSY("DEVICE_BUSY","设备通道被占用，请稍后再试"),
    DEVICE_NO_MAC("DEVICE_NO_MAC","设备没有配置物理地址，请确认后重试"),
    NOT_OUR_DEVICE("NOT_OUR_DEVICE", "对不起，您当前操作的设备非公司设备，请确认后再试"),
    FILE_NON_EXISTENT("FILE_NON_EXISTENT","文件不存在，请确认后再试"),
    FILE_TYPE_NOT_SUPPORT("FILE_TYPE_NOT_SUPPORT","文件格式不支持"),
    ERROR_FTP_UPLOAD("ERROR_FTP_UPLOAD","文件上传失败"),
    INSTRUCTION_CODE__NULL("INSTRUCTION_CODE__NULL","下发的指令码为空"),
    INSTRUCTION_TYPE__NULL("INSTRUCTION_TYPE__NULL","下发的指令协议为空"),
    ITC_TERMINAL_NULL("ITC_TERMINAL_NULL","广播音柱指令参数为空"),
    LIGHT_MAP_NULL("LIGHT_MAP_NULL","单灯没有对应的外设，请确认后再试"),
    MACANDPORT_NULL("MACANDPORT_NULL","外设缺少物理地址，请确认后再试"),

    //mdc
    MDC_PARAM_ID_NULL("MDC_0001","参数ID为空"),
    MDC_PARAM_MSG_TYPE_NULL("MDC_0002","参数消息类型或消息id为空"),
    MDC_PARAM_MSG_TYPE_NOT_EXIST("MDC_0003","参数消息类型不存在"),

    EXTERNAL_DEVICE_NULL("DEVICE_0001","卡莱特显示屏没有关联外设"),
    LIGHT_MAC_EXIST("LIGHT_MAC_EXIST","单灯网络地址重复"),
    LIGHT_NO_EXIST("LIGHT_NO_EXIST","单灯编号重复"),

    //device
    DATA_FOMAT_ERROR("DATA_FOMAT_ERROR", "时间格式错误"),

    ;
    private final String statusCode;
    private final String message;

    /**
     * 构造方法
     * @param statusCode
     * @param message
     */
    ResultMsgError(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    /**
     * 根据错误码获取具体出错信息
     * @param statusCode
     * @return
     */
    public static String getMessageByStatusCode(String statusCode) {
        for (ResultMsgError resultMsgError : ResultMsgError.values()) {
            if (Objects.equals(resultMsgError.statusCode, statusCode)) {
                return resultMsgError.message;
            }
        }
        return null;
    }

    /**
     * get,set方法
     * @return
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

}
