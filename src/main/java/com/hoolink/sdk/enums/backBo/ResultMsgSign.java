package com.hoolink.sdk.enums.backBo;

/**
 * Created by ds on 2017/12/11.
 * ResultMsg 操作类型
 */
public enum ResultMsgSign {
//   resultCrudBackBO crud操作类型枚举
    CRUD_CREATE,CRUD_UPDATE,CRUD_DELETE,CRUD_READ,
//   resultLoginBackBO login操作类型枚举
    BASE_LOGIN,
//  resultDeviceCommandBackBO设备命令枚举
    SCREEN_COMMAND,BROADCAST_COMMAND,CALL_COMMAND,NFC_COMMAND,WIFI_COMMAND,LIGHT_COMMAND,CAMERA_COMMAND,
//工厂项目
    DOWNLOAD
}
