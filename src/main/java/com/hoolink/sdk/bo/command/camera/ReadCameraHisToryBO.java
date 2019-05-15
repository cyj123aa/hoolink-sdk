package com.hoolink.sdk.bo.command.camera;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hoolink.sdk.bo.factory.EventEnum;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author czx
 * @date 2018/12/3
 * 历史回看vo
 */

public class ReadCameraHisToryBO {
    private String username;
    private String password;
    private String ip;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date endTime;
    private String port;
    private String mac;
    private Long eventId;
    private EventEnum eventEnum;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public EventEnum getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(EventEnum eventEnum) {
        this.eventEnum = eventEnum;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "ReadCameraHisToryBO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ip='" + ip + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", mac='" + mac + '\'' +
                ", eventId=" + eventId +
                ", eventEnum=" + eventEnum +
                '}';
    }
}
