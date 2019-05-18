package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.util.Date;

/**
 * @version V1.0
 * @classname:CameraBO
 * @author: xiaolei.yang
 * @date: 2019/4/3 13:51
 **/
@Data
public class CameraBO extends DeviceManagerBO {

    /*** 摄像头配置IP     */
    private Long deviceId;

    /*** 摄像头配置IP     */
    private String cameraIp;

    /*** 摄像头配置端口     */
    private String cameraPort;

    /*** 通道编号     */
    private String channelNo;

    /*** 摄像头账户名      */
    private String cameraAccount;

    /*** 摄像头密码      */
    private String cameraPassword;

    /*** 服务端口     */
    private String servicePort;

    /*** 设备验证码     */
    private String validateCode;

    /*** 最近通讯时间     */
    private Date lastTime;

    /*** factory外键,关联project_area     */
    private Long projectAreaId;

    /*** factory外键,关联event_basis     */
    private Long eventBasisId;

    private String pircture;

    /*** 灯杆mac */
    private String poleMac;
    /*** 灯杆mac */
    private String poleName;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;


}
