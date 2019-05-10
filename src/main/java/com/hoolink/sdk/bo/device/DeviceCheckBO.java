package com.hoolink.sdk.bo.device;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangdong
 * @date 2019/5/5 15:42
 */
@Data
public class DeviceCheckBO implements Serializable {

    private static final long serialVersionUID = 4580942542646522569L;

    /*** 灯杆错误返回 */
    List<CheckErrorBO> poleErrorList;

    /*** 集中器错误返回 */
    List<CheckErrorBO> externalErrorList;

    /*** 智慧照明错误返回 */
    List<CheckErrorBO> lightErrorList;

    /*** 数字监控错误返回 */
    List<CheckErrorBO> cameraErrorList;

    /*** 数字音响错误返回 */
    List<CheckErrorBO> soundBoxErrorList;

    /*** 实时广播错误返回 */
    List<CheckErrorBO> broadCastErrorList;

    /*** 一键呼叫错误返回 */
    List<CheckErrorBO> callErrorList;

    /*** 智能巡检错误返回 */
    List<CheckErrorBO> nfcErrorList;

    /*** 信息发布错误返回 */
    List<CheckErrorBO> screenErrorList;

    /*** 监控器错误返回 */
    List<CheckErrorBO> monitorErrorList;
}
