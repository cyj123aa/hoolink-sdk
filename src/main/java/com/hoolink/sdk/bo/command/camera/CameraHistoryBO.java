package com.hoolink.sdk.bo.command.camera;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author chenzhixiong
 * @date 2019/1/3 10:51
 */
public class CameraHistoryBO {
    private Long cameraId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    @ApiModelProperty(dataType = "java.lang.String", example = "2016-01-01 15:00:00")
    private Date endTime;

    @Override
    public String toString() {
        return "CaremaHistoryVO{" +
                "cameraId=" + cameraId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public Long getCameraId() {
        return cameraId;
    }

    public void setCameraId(Long cameraId) {
        this.cameraId = cameraId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
