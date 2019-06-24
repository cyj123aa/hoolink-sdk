package com.hoolink.sdk.bo.device.dmxprotobo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author zhangyy
 * @DateTime 2019-06-06 10:20
 * @Description
 */
@Data
public class FtpBO implements Serializable {
    @JSONField(name="FtpIP")
    private String ftpIP;
    @JSONField(name="FtpPort")
    private Integer ftpPort;
    @JSONField(name="FtpUser")
    private String ftpUser;
    @JSONField(name="FtpPassword")
    private String ftpPassword;
    @JSONField(name="FilePath")
    private String filePath;
    @JSONField(name="ResourceNo")
    private String resourceNo;
}
