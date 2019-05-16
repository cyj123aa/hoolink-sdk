package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2019/1/10 15:27
 */
public class ReadAloneCameraBO {
    private Long cameraId;
    private Long projectId;

    public Long getCameraId() {
        return cameraId;
    }

    public void setCameraId(Long cameraId) {
        this.cameraId = cameraId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "ReadAloneCameraBO{" +
                "cameraId='" + cameraId + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
