package com.hoolink.sdk.bo.command.camera.ys;

/**
 * @author chenzhixiong
 * @date 2018/12/29 14:02
 */
public class LiveStreamBackBO {
    private String code;

    private String msg;
    private Data data;

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

    @Override
    public String toString() {
        return "LiveStreamBackBO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public class Data{
        private String deviceSerial;
        private String channelNo;
        private String deviceName;
        private String liveAddress;
        private String hdAddress;
        private String rtmp;
        private String rtmpHd;
        private String status;
        private String exception;
        private String beginTime;
        private String endTime;

        public String getLiveAddress() {
            return liveAddress;
        }

        public void setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
        }

        public String getHdAddress() {
            return hdAddress;
        }

        public void setHdAddress(String hdAddress) {
            this.hdAddress = hdAddress;
        }

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }



        public String getDeviceSerial() {
            return deviceSerial;
        }

        public void setDeviceSerial(String deviceSerial) {
            this.deviceSerial = deviceSerial;
        }

        public String getChannelNo() {
            return channelNo;
        }

        public void setChannelNo(String channelNo) {
            this.channelNo = channelNo;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }


        public String getRtmp() {
            return rtmp;
        }

        public void setRtmp(String rtmp) {
            this.rtmp = rtmp;
        }

        public String getRtmpHd() {
            return rtmpHd;
        }

        public void setRtmpHd(String rtmpHd) {
            this.rtmpHd = rtmpHd;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getException() {
            return exception;
        }

        public void setException(String exception) {
            this.exception = exception;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "deviceSerial='" + deviceSerial + '\'' +
                    ", channelNo='" + channelNo + '\'' +
                    ", deviceName='" + deviceName + '\'' +
                    ", liveAddress='" + liveAddress + '\'' +
                    ", hdAddress='" + hdAddress + '\'' +
                    ", rtmp='" + rtmp + '\'' +
                    ", rtmpHd='" + rtmpHd + '\'' +
                    ", status='" + status + '\'' +
                    ", exception='" + exception + '\'' +
                    ", beginTime='" + beginTime + '\'' +
                    ", endTime='" + endTime + '\'' +
                    '}';
        }
    }
}
