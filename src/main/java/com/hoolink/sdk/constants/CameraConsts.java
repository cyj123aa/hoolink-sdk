package com.hoolink.sdk.constants;

/**
 * @version V1.0
 * @classname:CameraConsts
 * @author: xiaolei.yang
 * @date: 2019/4/4 15:31
 **/
public class CameraConsts {

    /**
     * 新增摄像头
     */
    public static final String ADDCAMERA = "addCamera";
    /***
     * 解密
     */
    public static final String ENCRYPTCAMERA = "encryptCamera";
    /**
     * 摄像头开启直播流
     */
    public static final String OPENCAMERA = "openCamera";
    /**
     * 摄像头云台控制开启
     */
    public static final String CONTROLSTART = "controlStart";
    /**
     * 摄像头云台控制停止
     */
    public static final String CONTROLEND = "controlEnd";
    /**
     * 摄像头抓拍截图
     */
    public static final String CAPTUREPICTURE = "capturePicture";
    /**
     * 获取单个摄像头实时预览画面
     */
    public static final String GETCAMERALIVESTREAM = "getCameraLiveStream";
    /**
     * 获取摄像头当前时间缩略图
     */
    public static final String GETCAMERACAPTURE = "getCameraCapture";




    public static final class HLS {
        public static final String HLS_TIME = "-hls_time";
        public static final String HLS_LIST_SIZE = "-hls_list_size";
        public static final String HLS_WRAP = "-hls_wrap";
        public static final String HLS = "hls";
        public static final String COPY = "copy";
        public static final String HLS_F = "-f";
        public static final String HLS_I = "-i";
        public static final String HLS_C = "-c";
        public static final String HLS_TIME_NUM = "2";
        public static final String HLS_LIST_NUM = "20";
        public static final String HLS_WRAP_NUM = "0";
        public static final String TYPE = ".m3u8";
        public static final String RTSP_PREFIX = "rtsp://";
        public static final String RTSP_COLON = ":";
        public static final String RTSP_SEPARATO = "/";
        public static final String RTSP_SIGN = "@";
        public static final String RTSP_MAIN = ":554/h264/ch1/main/av_stream";
        public static final String SDK_PORT = "8000";
        public static final String HLS_FILE_PATH = "hls.file.path";
        public static final String HLS_NGINX_HOST = "spring.nginx.host";
        public static final String MP4 = ".mp4";
        public static final String HLS_M= "/hls/";
        public static final String FFMPEG_PATH = "ffmpegPath";
        public static final String SPACE = " ";
        public static final String EZOPEN = "ezopen://open.ys7.com/";
        public static final String ADD_DEVICE_SUCCESS = "200";
        public static final String EXIST_CODE = "60020";
    }

}
