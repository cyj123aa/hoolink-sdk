package com.hoolink.sdk.bo.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : wangdong
 * @date : 2019/4/29 09:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScreenDeviceBO extends DeviceManagerBO {
    private static final long serialVersionUID = -1348476420748719367L;

    /**最后通讯时间**/
    private Long lastTime;

    /**亮度值**/
    private Integer screenBrightness;

    /**亮度模式 1：自动调节亮度、2：手动调节亮度、3：定时调节亮度**/
    private Integer brightnessMode;

    /**当前播放序号**/
    private Integer playNum;

    /**当前播放的文件清单**/
    private String currentPlayFile;

    /**设备通道号**/
    private String channelNo;

    /**资源文件数量**/
    private Integer fileNum;

    /**文件大小，单位M**/
    private Double filesSize;

    /**当前播放清单文件的配置**/
    private Long currenPlayConfig;

    /**标识是否有残留文件需要继续删除**/
    private Boolean hasResidue;

    /*** 灯杆mac */
    private String poleMac;

    /*** 灯杆型号名称 */
    private String poleSubTypeName;

}
