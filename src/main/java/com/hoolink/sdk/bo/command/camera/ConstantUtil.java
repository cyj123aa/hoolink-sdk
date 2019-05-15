package com.hoolink.sdk.bo.command.camera;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConstantUtil
 * @Description TODO
 * @Author Administrator
 * @DATE 2018/11/13 13:03
 */
public class ConstantUtil {

    public static final class CommonKey {
        public static final String API_PACKAGE = "com.hoolink.ability.controller";
        public static final Integer HTTP_CODE_SUCCESS = 200;
        public static final Integer MULTIPLE = 2;
        public static final Integer XSD_MULTIPLE = 100;
        public static Integer AITHRESHOLD = 70;
        public static final String PROTOCOL = "https://";
        public static final String DELIMITER = "/";
        public static final String GET_DELIMITER = "?";
        public static final String GET_PLACEHOLDER = "&";
        public static final String EQUAL_SIGN = "=";
        public static final String POINT_SIGN = ".";
        public static final Integer NOTMAL_SIZE = 1;
        public static final String  FEMALE= "female";
        public static final String  MALE= "male";
        public static final String REGEX ="[`~!#$%^&*()=|{}':;',\\[\\]<>/?~！#￥%……&*（）——|{}‘；：”“’。，、？]";
    }

    public static final class ITC {
        public static final String KEY = "code";
        public static final String FILE_NAME_REPEAT = "100";
        public static final String FILE_UPLOAD_SUCCESS = "200";
        public static int MUSIC_UPLOAD_STATUS_1 = 200;
        public static int MUSIC_UPLOAD_STATUS_2 = 300;
    }

    public static final class SPON {
        public static final String KEY = "res";
        public static final String FILE_NAME_REPEAT = "100";
        public static final String FILE_UPLOAD_SUCCESS = "1";
        public static final int LEN = 8192;


    }

    public static final class FaceHK{
        public static Integer AITHRESHOLD = 70;
        public static final Integer MULTIPLE = 2;
        public static final Integer XSD_MULTIPLE = 100;
        public static final String CAPABILITIES = "GET /ISAPI/Intelligent/FDLib/capabilities";
        public static final String CREATE_FACE_DATABASE = "POST /ISAPI/Intelligent/FDLib";
   }

    public static final class FaceHW{
        public static final String FACE_DETECT = "face-detect";
        public static final String FACE_SETS = "http-sets";
        public static final String FACES = "faces";
        public static final String SEARCH = "search";
        public static final String CREATE_NODE = "edgemgr/nodes";
        public static final String CREATE_TEMP = "edgemgr/device_templates";
        public static final String CREATE_DEVICE = "edgemgr/devices";
        public static final String GET_DEVICE_TEMPS = "edgemgr/device_templates";
        public static final String CREATE_FACE = "memberfaces";
        public static final String FACE_PICTURES = "facepictures";
        public static final String SERVICE_CONFIG = "service_config";
        public static final String SEARCH_FACE_HISTORY = "face-label-content/filter";
        public static final String SEARCH_STRANGER_FACE_HISTORY = "face-label-id/stranger-filter";
        public static final String SEARCH_MEMBER_FACE_LIST = "face-label-id/member-filter";
        public static final String GET_FRINGE_NODE_LIST = "ief-edge_node/resource_instances/action";
        public static final String UPDATE_DESCRIPTION = "edgemgr/nodes";
        public static final String ERROR_MSG = "error_msg";
        public static final String ERROR_CODE = "error_code";
        public static final String CONTROL_NODE = "action";
        public static final String FRINGE_NODE_NOT_ENOURH = "IEF.100126";

    }
    public static final class HWCode{
        public static final String CREATE_FACE_SUCCESS = "FRS.0000";
        public static final String FACE_NOT_POSE = "FRS.0121";
        public static final String FACE_ALREADY_EXITS = "FRS.0104";
    }
    public static final class HWKEY {
        public static final String CODE = "code";
        public static final String ERROR_CODE = "error_code";
    }


    public static final class File {
        public static final String END_POINT = "obs.cn-north-1.myhwclouds.com";
        public static final String ACCESS_KEY_ID = "KZYQW9GQUYIU5G7ONCAV";
        public static final String SECRET_ACCESS_KEY = "65nxJddaf9w17QNeVFi3Rwkp3Oh0fxBqiPvO6rHe";
        public static final String REGION_NAME = "cn-north-1";
        public static final String BUCKET_NAME = "hoolink-bucket";
        public static final String SIGN_ID = "d33ad62731e24162b2c9436ba93f7296";
        public static final Integer KB_SIZE = 1024;
        public static final Long PART_SIZE = 1024*1024*5L;
        public static final Long MAX_IMG_SIZE = 1024*5L;
        public static final Long MAX_AUDIO_SIZE = 1024*10L;
        public static final Long MAX_VIDEO_SIZE = 1024*1024*1024L*5;
        public static final Integer MAX_PART_COUNT = 10000;
        public static final List<String> IMG_EXT = new ArrayList<>();
        public static final List<String> FACE_EXT = new ArrayList<>();
        public static final List<String> getFaceExt(){
            FACE_EXT.add("jpg");
            FACE_EXT.add("jpeg");
            return FACE_EXT;
        }
        public static final List<String> getImgExt(){
            IMG_EXT.add("jpg");
            IMG_EXT.add("png");
            IMG_EXT.add("jpeg");
            IMG_EXT.add("gif");
            return IMG_EXT;
        }

        public static final List<String> AUDIO_EXT = new ArrayList<>();
        public static final List<String> getAudioExt() {
            AUDIO_EXT.add("wav");
            AUDIO_EXT.add("mp3");
            return AUDIO_EXT;
        }

        public static final List<String> VIDEO_EXT = new ArrayList<>();
        public static final List<String> getVideoExt(){
            VIDEO_EXT.add("wmv");
            VIDEO_EXT.add("rmvb");
            VIDEO_EXT.add("mp4");
            VIDEO_EXT.add("rm");
            VIDEO_EXT.add("3gp");
            VIDEO_EXT.add("avi");
            VIDEO_EXT.add("dat");
            VIDEO_EXT.add("mkv");
            VIDEO_EXT.add("flv");
            VIDEO_EXT.add("vob");
            return VIDEO_EXT;
        }
        public static final List<String> NOT_SUPPORT_EXT = new ArrayList<>();
        public static final List<String> getNotSupportExt(){
            return NOT_SUPPORT_EXT;
        }
    }

    public static final class  BusinessMsg{
        public static final String PARAM_ERROR = "参数错误";
        public static final String PARAM_EMPTY = "参数为空";
        public static final String IMG_FILE_BIG = "图片文件过大";
        public static final String IMG_FORMAT_ERROR = "图片格式错误";
        public static final String AUDIO_FILE_BIG = "音频文件过大";
        public static final String VIDEO_FILE_BIG ="视频文件过大";
        public static final String NO_MATCH_FACE = "未搜索到匹配结果";
        public static final String MATCH_SUCCESS = "搜索成功";
        public static final String FILE_UPLOAD_ERROR = "文件上传失败";
        public static final String FILE_NAME_REPEAT = "文件名重复";
        public static final String FACE_LID_EXIST = "该名称人脸库已存在，请更换人脸库名称";
        public static final String FACE_CREATE_FAILED = "人脸库创建失败";
        public static final String FACE_LIB_DEL_ERROR = "人脸库删除失败";
        public static final String FACE_LIB_MODIFY_FAILED = "人脸库修改失败";
        public static final String FACE_DEL_SUCCESS = "人脸删除成功";
        public static final String FACE_DEL_ERROR = "人脸删除失败";
        public static final String FACE_UPLOAD_SUCCESS = "人脸上传成功";
        public static final String RECEIVE_SUCCESS = "接受参数成功";
        public static final String MUSIC_LIST_GET_ERROR = "音乐列表获取失败";
        public static final String MUSIC_LIST_GET_SUCESS = "音乐列表获取成功";
        public static final String MUSIC_DELETE_SUCCESS = "音乐文件删除成功！";
        public static final String DOWN_LOAD_ERROR = "下载失败!";
        public static final String FILE_DELETE_ERROR = "文件删除失败";
        public static final String FILE_DELETE_SUCCESS= "文件删除成功";
        public static final String PROJECT_NO_FACE_SET = "该项目未创建人脸库";
        public static final String PROJECT_FACE_SET_DATA_ERROR = "人脸库数据异常";
        public static final String CAPTURE_PICTURE_ERROR = "图片抓拍失败!";
        public static final String IMG_EMPLOYEE = "图片文件上传中";
        public static final int HTTP_STATUS_200 = 200;
        public static final int HTTP_STATUS_206 = 206;
    }


    public static final class EI {
        /**
         * AI标签相关
         */
        public static final Integer SEX_LABEL_VALUE = 2;//AI识别性别标签枚举最大key值
        public static final Integer GLASS_LABEL_VALUE = 2;//AI识别是否戴眼镜标签枚举最大key值
        public static final Integer AGE_GROUP_LABEL_VALUE = 9;//AI识别年龄区间标签枚举最大key值
        public static final String ABNORMAL_DATA = "异常数据";//AI识别异常数据
    }


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
