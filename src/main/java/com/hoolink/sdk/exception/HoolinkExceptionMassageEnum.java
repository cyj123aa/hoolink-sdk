package com.hoolink.sdk.exception;

/**
 * @author XuBaofeng.
 * @date 2019-04-13 13:42.
 * <p>
 * description: 改枚举项是在进行业务上的判断需要抛出异常时才需要使用
 * * 对于无法捕获的异常, 统一使用抛异常的方式在切面内对message进行封装
 */
public enum HoolinkExceptionMassageEnum {

    /*** 程序逻辑异常时出去的提示信息message */
    SYSTEM_ERROR("系统错误"),
    PARAM_ERROR("参数错误"),
    LOGIN_ERROR("登录异常"),
    LOGIN_TIME_OUT("登录超时"),
    OTHER_USER_LOGIN("异地登录"),
    NOT_AUTH("无权限访问"),
    AUTH_ERROR("权限获取失败"),
    COMMAND_DOWN_ERROR("指令下发失败"),
    SWITCHCMD_CLASS_NULL("分发命令类未找到"),
    SWITCHCMD_METHOD_NULL("分发命令方法未找到"),
    NOT_REGISTERED_IN_THE_REGISTRY("未连接到注册中心"),

    /*** 用户管理提示信息message */
    USER_CUSTOMER_NUMBER_EXIST("客户号已存在"),
    USER_ACCOUNT_EXIST("账号已存在"),
    USER_ACCOUNT_NOT_EXIST("账号不存在"),
    USER_USER_NOT_EXIST("用户不存在"),
    USER_PHONE_EXISTS("手机号已被绑定，请更换其他手机号"),
    USER_PHONE_NOT_EXISTS("手机号不存在"),
    USER_BIND_PHONE_ERROR("手机绑定失败"),
    CAPTCHA_ERROR("验证码错误"),
    CAPTCHA_CACHE_TOO_FREQUENTLY("验证码存储过于频繁"),
    USER_LIST_ERROR("用户列表信息获取失败"),
    RESET_PASSWORD_ERROR("重置密码操作失败！"),
    ROLE_USER_NOT_EXIST("角色不存在"),
    ROLE_NAME_EXIST("角色名称重复"),
    /*** 项目管理提示信息message */
    PROJECT_SCENE_ERROR("项目类型获取失败！"),
    CREATE_PROJECT_ERROR("项目创建失败！"),
    UPDATE_PROJECT_ERROR("项目修改失败！"),
    GET_PROJECT_DETAIL_ERROR("项目详情获取失败！"),
    UPDATE_PROJECT_STATUS_ERROR("项目状态修改失败！"),
    GET_PROJECT_LIST_ERROR("项目列表查询失败！"),
    GET_PROJECT_MENU_ERROR("权限获取失败！"),
    UPDATE_PROJECT_MENU_ERROR("权限更新失败！"),
    UPDATE_PROJECT_OWNER_ERROR("修改项目负责人失败！"),
    GET_DEVICE_TYPE_ERROR("获取设备类型！"),
    UPDATE_DEVICE_TYPE_ERROR("获取设备类型！"),
    PROJECT_NAME_EXIST("项目名称已经存在"),

    /*** 设备管理提示信息message */
    DEVICE_MATCH_LIST_ERROR("获取匹配设备列表失败"),
    DEVICE_UPGRADE_NONE_ERROR("未找到需要升级的设备"),
    DEVICE_TYPE_NAME_REPEAT_ERROR("设备类型名称重复，请重新输入"),
    DEVICE_SUBTYPE_NAME_REPEAT_ERROR("设备型号名称重复，请重新输入"),
    DEVICE_CLUSTER_NAME_REPEAT_ERROR("设备种类名称重复，请重新输入"),
    DEVICE_NO_REPEAT_ERROR("设备编号重复，请重新输入"),
    DEVICE_MAC_REPEAT_ERROR("物理地址重复，请重新输入"),
    DEVICE_MAC_EMPTY_ERROR("物理地址不能为空"),
    DEVICE_SINGLE_DEVICE_LIST_ERROR("单设备查询失败"),
    GET_DEVICE_SUB_TYPE_ERROR("获取设备型号失败"),
    DEVICE_UPGRADE_ERROR("设备升级失败"),
    GET_DEVICE_CASCADE_DATA_ERROR("获取设备级联数据失败"),
    GET_FILE_DATA_ERROR("获取设备级联数据失败"),
    SELECT_DEVICE_FACTORY_ERROR("获取厂商失败"),
    CREATE_DEVICE_FACTORY_ERROR("创建厂商失败"),
    UPDATE_DEVICE_FACTORY_ERROR("修改厂商是吧"),
    REMOVE_DEVICE_FACTORY_ERROR("删除厂商失败"),

    GET_DEVICE_DETAIL_ERROR("设备详情获取失败"),
    DEVICE_TYPE_NAME_ERROR("设备类型获取失败"),
    DEVICE_MODEL_CREATE_ERROR("设备模型创建失败"),
    DEVICE_MODEL_UPDATE_ERROR("设备模型更新失败"),
    DEVICE_MODEL_REMOVE_ERROR("设备模型删除失败"),
    DEVICE_REMOVE_ERROR("设备删除失败"),
    DEVICE_UPDATE_ERROR("设备修改失败"),
    CHOOSE_CONCENTRATOR_ERROR("获取集中器列表失败"),
    CHOOSE_POLE_ERROR("获取灯杆列表失败"),
    CHOOSE_RADIO_ERROR("获取广播列表失败"),
    GET_PROJECT_ID_ERROR("所属项目不能为空"),

    /*** 客户管理提示信息 */
    GET_CUSTOMER_LIST_ERROR("客户列表获取失败！"),
    CREATE_CUSTOMER_ERROR("客户创建失败！"),
    UPDATE_CUSTOMER_ERROR("客户更新失败！"),
    AUTH_CUSTOMER_ERROR("更新客户权限失败！"),
    CUSTOMER_NO_EXIST_ERROR("客户号已存在！"),
    CUSTOMER_DETAIL_NULL("客户详情信息为空！"),
    CUSTOMER_NAME_EXIST_ERROR("公司名称已存在！"),

    /*** 管理系统登录用户提示信息 */
    USER_NOT_EXIST_ERROR("当前登录用户不存在！"),

    /*** hoolink rpc */
    USER_ACCOUNT_ERROR("登录账号或密码不正确"),
    USER_ACCOUNT_DISABLED("账户已被禁用，请联系管理员"),
    USER_CUSTOMER_DISABLED("客户号已被禁用，请联系管理员"),
    USER_ROLE_DISABLED("该账户所属角色已被禁用，请联系管理员"),
    CAPTCHA_SEND_ERROR("验证码发送失败"),
    CAPTCHA_INPUT_ERROR("验证码输入错误，请重新输入"),
    PHONE_BIND_ERROR("账号未绑手机号，请联系管理员"),
    USER_GET_ERROR("个人信息查询失败"),
    RPC_USER_PHONE_EXISTS("手机号已被绑定，请更换其他手机号"),

    /*** manage-base */
    UPDATE_DEVICE_MAINTAIN("更新设备的维保年限失败"),
    GET_DEVICE_TYPE_INFO("获得设备类型信息"),
    GET_DEVICE_TYPE_MAINTAIN_INFO("获得设备类型维保信息"),
    USER_ACCOUNT_OR_PASSWORD_ERROR("账号或密码错误，请重新输入"),
    USER_FORBIDDEN("该账号已被禁用，请联系管理员"),
    PHONE_CODE_ERROR("您输入的验证码有误！"),
    ACCOUNT_NOT_EXIST("该账号不存在!"),
    NOT_BIND_PHONE("未绑定安全手机，请联系管理员"),
    PHONE_CODE_SEND_ERROR("手机验证码发送失败"),
    EXCEL_ERROR("excel错误"),
    GET_CURRENT_USER_ERROR("获取当前登录用户失败"),
    PHONE_EXISTS("该手机号已存在"),
    GET_CHECK_EXCEL_DATA_ERROR("获取校验excel数据结果失败"),
    READ_FIRMWARE_FILE_ERROR("固件文件读取失败"),

    /*** manage-base-版本管理 */
    VERSION_DETAIL_ERROR("版本详情信息获取失败"),

    /*** manage-base-设备设备日志 */
    GET_LIST_DEVICE_LOG_ERROR("设备日志列表数据获取失败"),
    /*** ability */
    CREATE_BUCKET_ERROR("obs创建桶失败"),
    UPLOAD_FILE_ERROR("文件上传失败"),
    CHECK_FIRMWARE_ERROR("固件校验未通过！请确认输入固件版本与上传文件是否一致"),
    FIRMWARE_NAME_OUT_OF_ORDER("输入固件版本不符合规则！"),
    FIRMWARE_FILE_FORMAT_ORDER("上传固件格式不正确！请确认后再试"),
    ;

    private String message;

    public String getMassage() {
        return message;
    }

    HoolinkExceptionMassageEnum(String message) {
        this.message = message;
    }

    public static final Boolean isExist(String message) {
        for (HoolinkExceptionMassageEnum anEnum : HoolinkExceptionMassageEnum.values()) {
            if (anEnum.message.equals(message)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
