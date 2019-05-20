package com.hoolink.sdk.bo.command.camera;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.io.InputStream;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class FaceEvent {

    private InputStream smallImg;
    private InputStream bigImg;
    private String nvrIp;
    private String channelIp;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date eventTime;
    private float xsd;
    private boolean status;
    private String nvrFaceId;
    private String name;
    private String nvrFDId;
    private Integer glass;
    private Integer sex;
    private Integer ageGroup;

    public InputStream getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(InputStream smallImg) {
        this.smallImg = smallImg;
    }

    public InputStream getBigImg() {
        return bigImg;
    }

    public void setBigImg(InputStream bigImg) {
        this.bigImg = bigImg;
    }

    public String getNvrIp() {
        return nvrIp;
    }

    public void setNvrIp(String nvrIp) {
        this.nvrIp = nvrIp;
    }

    public String getChannelIp() {
        return channelIp;
    }

    public void setChannelIp(String channelIp) {
        this.channelIp = channelIp;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public float getXsd() {
        return xsd;
    }

    public void setXsd(float xsd) {
        this.xsd = xsd;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNvrFaceId() {
        return nvrFaceId;
    }

    public void setNvrFaceId(String nvrFaceId) {
        this.nvrFaceId = nvrFaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNvrFDId() {
        return nvrFDId;
    }

    public void setNvrFDId(String nvrFDId) {
        this.nvrFDId = nvrFDId;
    }

    public Integer getGlass() {
        return glass;
    }

    public void setGlass(Integer glass) {
        this.glass = glass;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Integer ageGroup) {
        this.ageGroup = ageGroup;
    }
}
