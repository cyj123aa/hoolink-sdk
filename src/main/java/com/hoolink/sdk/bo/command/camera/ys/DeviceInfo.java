package com.hoolink.sdk.bo.command.camera.ys;

/**
 * @author chenzhixiong
 * @date 2019/2/28 19:00
 */
public class DeviceInfo {

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private String code;
    private String msg;
    private Data data;
    public class Data{
        private String deviceSerial;
        private String deviceName;
        private String model;
        private Integer status;
        private String defence;
        private String isEncrypt;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDeviceSerial() {
            return deviceSerial;
        }

        public void setDeviceSerial(String deviceSerial) {
            this.deviceSerial = deviceSerial;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }


        public String getDefence() {
            return defence;
        }

        public void setDefence(String defence) {
            this.defence = defence;
        }

        public String getIsEncrypt() {
            return isEncrypt;
        }

        public void setIsEncrypt(String isEncrypt) {
            this.isEncrypt = isEncrypt;
        }
    }
}
