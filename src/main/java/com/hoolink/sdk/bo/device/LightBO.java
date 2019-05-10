package com.hoolink.sdk.bo.device;

import lombok.Data;

/**
 * @author XuBaofeng.
 * @date 2019-04-01 9:18.
 * <p>
 * description:
 */
@Data
public class LightBO extends DeviceManagerBO {
    private static final long serialVersionUID = -2707275173322303306L;


    /*** 设备基础表主键ID */
    private Long deviceManagerId;

    /*** 所属集中器ID */
    private Long externalId;

    /*** 设备故障时回填的故障ack值 */
    private String ack;

    /*** 电压 */
    private String voltage;

    /*** 电流 */
    private String lightCurrent;

    /*** 功率 */
    private String lightPower;

    /*** 调光值 */
    private Integer dimmingValue;

    /*** 光衰 */
    private String lightWeak;

    /*** 耗电量 度 */
    private String powerCost;

    /*** 温度 */
    private Integer temperature;

    /*** 工作时长，从第一开灯到现在，累加 */
    private Integer workingTime;

    /*** 巡检时间，上一次查询的时间 */
    private Long lastTime;

    /*** 灯杆mac */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;

    /*** 集中器mac */
    private String externalMac;

    /*** 集中器型号名称 */
    private String externalSubTypeName;

}
