package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2019/1/10 13:10
 */
public class AddAloneCameraBO {
    private String deviceSerial;
    private String validateCode;
    private Long cameraId;

    public Long getCameraId() {
        return cameraId;
    }

    public void setCameraId(Long cameraId) {
        this.cameraId = cameraId;
    }

    @Override
    public String toString() {
        return "AddAloneCameraBO{" +
                "deviceSerial='" + deviceSerial + '\'' +
                ", validateCode='" + validateCode + '\'' +
                '}';
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
