package com.hoolink.sdk.enums;

/**
 * Created by zhao_aken on 2018/1/11.
 */
public enum PropertyCfg {
    /**
     * 网关地址
     */
    GATEWAY_ADDR("gateway.addr"),
    /**
     * netty端口
     */
    NETTY_PORT("netty.port"),
    /**
     * redis 地址
     */
    REDIS_HOST("redis.host"),
    /**
     * redis密码
     */
    REDIS_PWD("redis.pwd"),
    /**
     * redis端口
     */
    REDIS_PORT("redis.port"),
    /**
     * fastdfs地址
     */
    FASTDFS_HOST("fastdfs.host"),
    /**
     * fastdfs 端口
     */
    FASTDFS_PORT("fastdfs.port"),
    /**
     * rabbitMQ地址
     */
    RABBITMQ_HOST("rabbitMQ.host"),

    HUAWEI_ACCESSKEY("huawei.accesskey"),
    HUAWEI_SECRETKEY("huawei.secretkey"),
    HUAWEI_REGION("huawei.region"),
    HUAWEI_PROJECT_ID("huawei.project.id"),
    HUAWEI_OBS_ENDPOINT("huawei.obs.endpoint"),
    HUAWEI_OBS_HTTPSONLY("huawei.obs.httpsonly"),
    HUAWEI_OBS_SOCKET_TIMOUT("huawei.obs.socket.timout"),
    HUAWEI_OBS_CONNECTION_TIMEOUT("huawei.obs.connection.timeout"),
    HUAWEI_DIS_ENDPOINT("huawei.dis.endpoint"),
    HUAWEI_FACE_ENDPOINT("huawei.face.endpoint"),
    HUAWEI_FACE_API_VERSION("huawei.face.api.version"),
    HUAWEI_FACE_SERVICE_NAME("huawei.face.service.name"),
    HUAWEI_IEF_SERVICE_NAME("huawei.ief.service.name"),
    HUAWEI_IEF_API_VERSION("huawei.ief.api.version"),
    HUAWEI_IEF_ENDPOINT("huawei.ief.endpoint"),
    HUAWEI_AIS_ENDPOINT("huawei.ais.endpoint"),

    HAIKANG_ACCESSKEY("haikang.accesskey"),
    HAIKANG_SECRETKEY("haikang.secretkey"),
    HAIKANG_ACCESSTOKEN_ENDPOINT("haikang.access.token.endpoint"),
    HAIKANG_PICTURE_ENDPOINT("haikang.picture.endpoint"),
    HAIKANG_LIVE_ENDPOINT("haikang.live.endpoint"),
    HAIKANG_PTZ_START_ENDPOINT("haikang.ptz.start.endpoint"),
    HAIKANG_PTZ_END_ENDPOINT("haikang.ptz.end.endpoint"),
    HAIKANG_PTZ_MIRROR_ENDPOINT("haikang.ptz.mirror.endpoint"),
    HAIKANG_ADD_DEVICE_ENDPOINT("haikang.add.device.endpoint"),
    HAIKANG_ENCODE_DEVICE_ENDPOINT("haikang.encode.device.endpoint"),
    HAIKANG_ENCODE_DEVICE_INFO("haikang.info.device.endpoint"),
    HAIKANG_OPEN_DEVICE_ENDPOINT("haikang.open.device.endpoint"),
    ;
    private String key;

    PropertyCfg(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
