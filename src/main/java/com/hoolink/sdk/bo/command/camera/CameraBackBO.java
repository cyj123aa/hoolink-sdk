package com.hoolink.sdk.bo.command.camera;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class CameraBackBO implements Comparable<CameraBackBO> {

  private String pircture;

  private String hlsUrl;

  private Long cameraId;

  private String cameraName;

  private String poleName;

  private String poleNo;

  public String getPoleNo() {
    return poleNo;
  }

  public void setPoleNo(String poleNo) {
    this.poleNo = poleNo;
  }

  private String deviceSerial;

  private String channelNo;

  public String getCameraNo() {
    return cameraNo;
  }

  public void setCameraNo(String cameraNo) {
    this.cameraNo = cameraNo;
  }

  private String cameraNo;

  private String  cameraIp;

  private String  cameraPort;

  private String  cameraDesc;

  private String  installAddress;

  private String  responsibilityGroup;

  private String  deviceTitle;

  public String getDeviceTitle() {
    return deviceTitle;
  }

  public void setDeviceTitle(String deviceTitle) {
    this.deviceTitle = deviceTitle;
  }

  public String getCameraIp() {
    return cameraIp;
  }

  public void setCameraIp(String cameraIp) {
    this.cameraIp = cameraIp;
  }

  public String getCameraPort() {
    return cameraPort;
  }

  public void setCameraPort(String cameraPort) {
    this.cameraPort = cameraPort;
  }

  public String getCameraDesc() {
    return cameraDesc;
  }

  public void setCameraDesc(String cameraDesc) {
    this.cameraDesc = cameraDesc;
  }

  public String getInstallAddress() {
    return installAddress;
  }

  public void setInstallAddress(String installAddress) {
    this.installAddress = installAddress;
  }

  public String getResponsibilityGroup() {
    return responsibilityGroup;
  }

  public void setResponsibilityGroup(String responsibilityGroup) {
    this.responsibilityGroup = responsibilityGroup;
  }

  public String getChannelNo() {
    return channelNo;
  }

  public void setChannelNo(String channelNo) {
    this.channelNo = channelNo;
  }

  public String getDeviceSerial() {
    return deviceSerial;
  }

  public void setDeviceSerial(String deviceSerial) {
    this.deviceSerial = deviceSerial;
  }

  public String getPoleName() {
    return poleName;
  }

  public void setPoleName(String poleName) {
    this.poleName = poleName;
  }

  public String getCameraName() {
    return cameraName;
  }

  public void setCameraName(String cameraName) {
    this.cameraName = cameraName;
  }

  public Long getCameraId() {
    return cameraId;
  }

  public void setCameraId(Long cameraId) {
    this.cameraId = cameraId;
  }

  public String getPircture() {
    return pircture;
  }

  public void setPircture(String pircture) {
    this.pircture = pircture;
  }

  public String getHlsUrl() {
    return hlsUrl;
  }

  public void setHlsUrl(String hlsUrl) {
    this.hlsUrl = hlsUrl;
  }

  @Override
  public String toString() {
    return "CameraBackBO{" +
            "pircture='" + pircture + '\'' +
            ", hlsUrl='" + hlsUrl + '\'' +
            ", cameraId=" + cameraId +
            ", cameraName='" + cameraName + '\'' +
            ", poleName='" + poleName + '\'' +
            ", deviceSerial='" + deviceSerial + '\'' +
            ", channelNo=" + channelNo +
            '}';
  }



  @Override
  public int compareTo(CameraBackBO o) {
      return this.cameraId.compareTo(o.getCameraId());
  }
}
