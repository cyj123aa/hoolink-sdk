package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2019/1/10 15:54
 */
public class ReadAloneCameraLiveStreamBO {
    private Long projectId;
    private Long cameraId;

    @Override
    public String toString() {
        return "ReadAloneCameraLiveStreamBO{" +
                "projectId=" + projectId +
                ", cameraId=" + cameraId +
                '}';
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getCameraId() {
        return cameraId;
    }

    public void setCameraId(Long cameraId) {
        this.cameraId = cameraId;
    }
}
