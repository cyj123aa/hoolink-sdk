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
    PAGE_TIME_OUT("页面超时，请重新操作！"),
    OTHER_USER_LOGIN("异地登录"),
    NOT_AUTH("无权限访问"),
    AUTH_ERROR("权限获取失败"),
    COMMAND_DOWN_ERROR("指令下发失败"),
    NOT_REGISTERED_IN_THE_REGISTRY("未连接到注册中心"),
    SERVICE_CONSUME_FAULT("微服务调用失败"),

    /*** 用户管理提示信息message */
    USER_CUSTOMER_NUMBER_EXIST("客户号已存在"),
    USER_ACCOUNT_EXIST("账号已存在"),
    USER_ACCOUNT_NOT_EXIST("账号不存在"),
    USER_USER_NOT_EXIST("用户不存在"),
    USER_PHONE_EXISTS("手机号已被绑定，请更换其他手机号"),
    USER_PHONE_NOT_EXISTS("手机号不存在"),
    USER_BIND_PHONE_ERROR("手机绑定失败"),
    CAPTCHA_ERROR("您输入的验证码有误！"),
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
    PROJECT_STATUS_ERROR("项目状态失效，无法操作！"),
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
    BATCH_IMPORT_EXCEL_DATE_ERROR("批量导入设备数据失败"),

    DELETE_CLUSTER_SUBTYPE_ERROR("该设备种类下有设备型号，不能删除"),
    DELETE_TYPE_SUBTYPE_ERROR("该设备类型下有设备型号，不能删除"),
    DEVICE_TYPE_NOT_EXIST_ERROR("该设备的设备类型不存在"),

    FACTORY_ID_NOT_NULL_ERROR("厂商ID不能为空"),
    DEVICE_ID_NOT_NULL_ERROR("设备ID不能为空"),
    DEVICES_ALREADY_GROUPED("保存失败，设备已存在其他分组中"),

    /*** 显示屏相关提示信息 */
    SCREEN_CREATE_LST_ERROR("清单LST文件创建失败"),
    SCREEN_TXT_ID_ERROR("文本ID不正确"),
    PROJECT_CONFIG_MAX_ERROR("该项目下项目已经达到100个，不可再添加"),
    SCREEN_ONLINE_ERROR("显示屏上线状态更新失败"),
    SCREEN_OFFLINE_ERROR("显示屏下线状态更新失败"),
    SCREEN_DATA_ERROR("找不到需要操控的清单或者设备"),
    SCREEN_ALL_OFFLINE_ERROR("该清单中显示屏全部离线"),
    SCREEN_CONFIG_ID_ERROR("清单ID不正确"),
    LIGHT_DIMMER_ERROR("调光值不能为空"),
    CHANNEL_NO_ERROR("该设备已断线，不可操作"),

    /*** 巡检 */
    INSPECTION_TIME_SELECT_ERROR("请选择自定义时间"),
    INSPECTION_RUNNING_UPDATE_ERROR("巡检计划正在进行中，无法编辑！"),
    INSPECTION_RUNNING_REMOVE_ERROR("巡检计划正在执行中，无法删除！"),
    INSPECTOR_NAME_EXIST("姓名已存在！"),
    INSPECTOR_NUMBER_EXIST("编号已存在！"),

    /*** 客户管理提示信息 */
    GET_CUSTOMER_LIST_ERROR("客户列表获取失败！"),
    CREATE_CUSTOMER_ERROR("客户创建失败！"),
    UPDATE_CUSTOMER_ERROR("客户更新失败！"),
    AUTH_CUSTOMER_ERROR("更新客户权限失败！"),
    CUSTOMER_NO_EXIST_ERROR("客户号已存在！"),
    CUSTOMER_DETAIL_NULL("客户详情信息为空！"),
    CUSTOMER_NAME_EXIST_ERROR("公司名称已存在！"),
    CUSTOMER_NO_EXIST_NULL("公司号不存在！"),

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
    DEVICE_MAINTAIN_LOW("设备的维保年限过低"),
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
    READ_FILE_ERROR("文件读取失败"),
    CREATE_FIRMWARE_ERROR("创建固件失败！"),
    UPDATE_FIRMWARE_ERROR("编辑固件失败！"),
    READ_FIRMWARE_BY_ID_ERROR("查询固件详情失败！"),
    READ_FIRMWARE_LIST_BY_DEVICESUBTYPE_ID_ERROR("查询固件列表失败！"),
    READ_FIRMWARE_LIST_BY_PARAM_ERROR("查询固件列表失败！"),
    REMOVE_FIRMWARE_ERROR("删除固件失败！"),
    DEPARTMENT_ENCRY_LEVEL_DEFAULT_NULL("部门或者对应密保等级为空！"),
    COMPANY_CODE_ERROR("公司不允许为空！"),
    NOT_LOGIN_ERROR("未登录！"),
    FORBIDDEN("无权访问！"),
    ACCESS_OBS_FAILED("访问OBS服务失败"),
    READ_INIT_MENU_FAILED("初始化菜单列表失败"),
    READ_NEXT_MENU_FAILED("获取下级菜单列表失败"),
    LIST_MENU_BY_ROLE("根据角色获取菜单失败"),
    ORG_INFO_ERROR("获取组织架构信息失败"),
    ENCRYPTED_LEVEL_ERROR("获取密保等级失败"),
    USER_ACCOUNT_EXISTS("账号重复"),
    EXCEL_COMPANY_ERROR("请选择正确的公司"),
    EXCEL_DEPT_ERROR("请选择正确的部门"),
    EXCEL_TEAM_ERROR("请选择正确的team"),
    EXCEL_ROLE_ERROR("请选择正确的角色"),
    EXCEL_ENCRY_LEVEL_ERROR("请选择正确的加密等级"),
    EXCEL_VIEW_ENCRY_PERMITTED_ERROR("请选择是否可见员工密保等级"),
    USER_NO_EXISTS("编号重复"),
    DEPARTMENT_FORMAT_ERROR("部门格式不正确！"),
    TYPE_AT_LEASE_DEPT("请至少选择到部门层级！"),
    DEPARTMENT_REPEAT_OR_CONTAIN("部门添加不能出现重复或者包含的关系！"),
    EXCEL_DATA_FORMAT_ERROR("excel数据格式错误！"),
    EXCEL_SEX_ERROR("请选择性别"),
    EXCEL_IMPORTED_FAILED("数据导入失败"),
    DEPT_NOT_SELECTED("组织架构未选择"),

    /*** manage-base-版本管理 */
    VERSION_DETAIL_ERROR("版本详情信息获取失败"),

    /*** manage-base-设备设备日志 */
    GET_LIST_DEVICE_LOG_ERROR("设备日志列表数据获取失败"),
    /*** ability */
    CREATE_BUCKET_ERROR("obs创建桶失败"),
    UPLOAD_FILE_ERROR("文件上传失败"),
    CHECK_FIRMWARE_ERROR("固件校验未通过！请确认输入固件版本与上传文件是否一致"),
    FIRMWARE_NAME_OUT_OF_ORDER("输入固件版本不符合规则！"),
    SEND_SMS_ERROR("发送短信失败"),

    DEVICE_CHECK_PASSWORD_NOT_EXIST("密码不能为空, 请输入密码!"),
    DEVICE_CHECK_PASSWORD_ERROR("密码错误, 请重新输入!"),
    FIRMWARE_FILE_FORMAT_ORDER("上传固件格式不正确！请确认后再试"),
    DEVICE_GROUP_NAME_NOT_EXIST("设备分组名称不能为空!"),
    DEVICE_GROUP_NOT_EXIST("密码不能为空, 请输入密码!"),
    MANAGER_USER_NOT_EXIST_ERROR("该用户不存在！"),
    CREATE_GROUP_ERROR("创建组失败!"),
    USER_MENU_INCOMPLETE("用户菜单权限不完整!"),
    PLEASE_MENU_CONFIG("请配置菜单权限!"),
    USER_NOT_VISITOR("当前用户角色无权限!"),

    /** hoolink-command */
    SWITCHCMD_CLASS_NULL("分发命令类未找到"),
    SWITCHCMD_METHOD_NULL("分发命令方法未找到"),
    NB_ACCESS_TOKEN_FAULT("nb平台获取accessToken失败"),
    NB_SERVICE_CONSUME_FAULT("nb平台调用失败"),

    /** edm */
    USER_SECURITY_NOT_EXIST("用户资源密保等级不存在"),
    OUTPUT_FILE_NOT_EXIST("输出的文件不纯在"),
    REPERTORY_INFO_ERROR("需要设置的文件资源为空！"),
    ORG_LIST_TREE_ERROR("获取组织架构树失败！"),
    FILE_NO_JURISDICTION("获取文件密保权限失败"),
    FILE_JURISDICTION_PARAM_ERROR("获取文件密保权限参数错误"),
    MANAGE_DEPARTMENT_TREE("获取组织架构失败"),
    USER_ROLE_NOT_EXIST("用户角色不能为空！"),
    USER_NO_FILE_UPDATE_PERMISSION_ERROR("该用户没有编辑权限，请联系管理员授权！"),
    PARENT_NODE_NOT_FOUNT("父级资源没有发现"),
    UNSATISFIED_PERMISSIONS_EXIST_IN_THE_FAVORITE_FILE("收藏文件中存在不满足您权限的文件，无法收藏！"),
    NO_PERMISSION_OPERA("您权限不足，无法移动！"),
    FILE_NOT_EXIST("该文件不存在"),
    PLEASE_SET_SUITABLE_TIMEOUT("请设置合适的超时时间"),
    NO_PREVIEW_PERMISSIONS("无预览权限"),
    EDM_CLAIM_UPLOAD_ID_FAILED("获取文件分块上传uploadId失败"),
    EDM_UPLOAD_PART_FAILED("文件分块上传失败"),
    EDM_COMPLETE_MULTIPART_UPLOAD_FAILED("合并文件失败失败"),
    UPLOAD_EDM_FAILED("文件上传失败"),
    NO_PERMISSION_OPERA_DOWNLOAD("文件权限不足，请联系文控中心人员进行下载！"),
    NO_PERMISSION_OPERA_ARCHIVE("所选文件中存在无权限归档的文件，请重新选择或者联系管理员！"),
    NO_PERMISSION_OPERA_DELETE("所选文件中存在无权限删除的文件，请重新选择或者联系管理员！"),
    NO_PERMISSION_SETTING("无权限设置该文件或文件夹！"),

    /** mdc */
    MESSAGE_JPUSH_ERROR("极光推送消息失败"),
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
