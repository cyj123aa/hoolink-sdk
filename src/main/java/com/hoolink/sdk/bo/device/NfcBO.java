package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lixiaoran
 * @date 2019-04-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NfcBO extends DeviceManagerBO{

    private static final long serialVersionUID = -2225048499310181021L;

    /*** 昨天实际的打卡次数 */
    private Integer factYesterday;

    /*** 昨天计划的打卡次数 */
    private Integer planYesterday;

    /*** 今天实际打卡次数 */
    private Integer factToday;

    /*** 今天计划打卡次数 */
    private Integer planToday;

    /*** 上次打卡时间 */
    private Long lastTime;

    /*** 灯杆mac */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;

}