package com.hoolink.sdk.constants;

/**
 * @author zhouyun
 * @data 2018/5/30 17:14
 */
public class RabbitMQConstants {

    /**
     * 设备升级(device发送，support接收)
     */
    public static final String DEVICE_UPGRADE_QUEUE = "device.upgrade.queue";
    public static final String DEVICE_UPGRADE_EXCHANGE = "device.upgrade.exchange";

    /**
     * 设备升级(support发送，socket接收)
     */
    public static final String DEVICE_UPGRADE_SOCKET_QUEUE = "device.upgrade.socket.queue";
    public static final String DEVICE_UPGRADE_SOCKET_EXCHANGE = "device.upgrade.socket.exchange.new";
    public static final String DEVICE_UPGRADE_SOCKET_EXCHANGE_ROUTING_KEY  = "device.upgrade.socket.exchange.routing.key";

    /**
     * 派工交换器
     * 设备升级
     */
    public static final String DIRECT_DISPATCH_EXCHANGE = "direct.dispatch.exchange";
    public static final String FANOUT_DISPATCH_EXCHANGE = "fanout.dispatch.exchange";

    /**
     * 告警交换器
     */
    public static final String DIRECT_ALARM_EXCHANGE = "direct.alarm.exchange";
    public static final String FANOUT_ALARM_EXCHANGE = "fanout.alarm.exchange";

    /**
     * 派工消息队列
     */
    public static final String DISPATCH_QUEUE = "direct.dispatch.queue";

    /**
     * 派工webSocket消息队列
     */
    public static final String DISPATCH_SOCKET_QUEUE = "direct.socket.dispatch.queue";

    /**
     * 告警webSocket消息队列
     */
    public static final String ALARM_SOCKET_QUEUE = "direct.socket.alarm.queue";

    /**
     * 灯杆设备实时信息消息队列
     */
    public static final String POLE_INFO_QUEUE = "pole.info.queue";
    public static final String POLE_INFO_EXCHANGE = "pole.info.exchange";

    /**
     * 灯杆设备状态消息队列
     */
    public static final String POLE_STATUS_QUEUE = "pole.status.queue";
    public static final String POLE_STATUS_EXCHANGE = "pole.status.exchange";

    /**
     * 工厂访客消息队列
     */
    public static final String FACTORY_VISITOR_EXCHANGE = "factory.visitor.exchange";
    public static final String FACTORY_VISITOR_QUEUE = "factory.visitor.queue";

    /**
     * 工厂访客定位消息队列
     */
    public static final String FACTORY_VISITOR_LOCATION_QUEUE = "factory.visitor.location.queue";
    public static final String FACTORY_VISITOR_LOCATION_EXCHANGE = "factory.visitor.location.exchange";

    /**
     * 工厂摄像头事件消息队列
     */
    public static final String FACTORY_CAMERA_EVENT_QUEUE = "factory.camera.event.queue";
    public static final String FACTORY_CAMERA_EVENT_EXCHANGE = "factory.camera.event.exchange";

    /**
     * web页面触发异步事件消息队列
     */
    public static final String WEB_ASYNC_EVENT_QUEUE = "web.async.event.queue";
    public static final String WEB_ASYNC_EVENT_EXCHANGE = "web.async.event.exchange";
    /**
     * 阈值配置发布交换器
     */
    public static final String BASE_THRESHOLD_CONFIG_FANOUT_EXCHANGE = "base.threshold.config.fanout.exchange";

    /**
     * 报警服务，阈值配置订阅队列
     */
    public static final String ALARM_THRESHOLD_CONFIG_QUEUE = "alarm.threshold.config.queue";

    /**
     * manage-base固件升级推送
     */
    public static final String DEVICE_UPGRADE_FANOUT_EXCHANGE = "device.upgrade.fanout.exchange";

    /**
     * 消息订阅修改同步redis发送的消息队列
     */
    public static final String UPDATE_MESSAGE_SUBSCRIBE_QUEUE = "update.message.subscribe.queue";

    public static final String FANOUT_EXCHANGE= "fanoutExchange";

    public static final String EXCHANGE= "exchange";

    public static final String SCREEN_SEND_RATE_QUEUE= "screen.send.rate.queue";
    public static final String SCREEN_SEND_RATE_EXCHANGE= "screen.send.rate.exchange";

    /**
     * 音乐策略消息队列
     */
    public static final String MUSIC_TIMING_STRATEGY_QUEUE = "music.strategy.queue";
    public static final String MUSIC_TIMING_STRATEGY_EXCHANGE = "music.strategy.exchange";
    public static final String MUSIC_TIMING_STRATEGY_EXCHANGE_ROUTING_KEY = "music.strategy.exchange.key";

    /**
     * 成员人脸消息队列
     */
    public static final String MEMBER_FACE_QUEUE = "member.face.queue";
    public static final String MEMBER_FACE_ROUTING_KEY = "member.face.routing.key";
    /**
     * 工单消息队列
     */
    public static final String WORK_ORDER_QUEUE = "work.order.queue";
    public static final String WORK_ORDER_EXCHANGE = "work.order.exchange";
    public static final String WORK_ORDER_EXCHANGE_ROUTING_KEY = "work.order.exchange.key";

    /** MDC单对单消息队列 消息相关的MQ配置,此处的配置常量用于消息推送业务 **/
    public static final String MDC_EXCHANGE = "mdc.exchange";
    /** MDC广播类消息公用队列 **/
    public static final String MDC_COMMON_QUEUE_ROUTING_KEY = "mdc.common.queue.key";
    /**
     * edm文件消息队列
     */
    public static final String EDM_CACHE_FILE_QUEUE = "edm.file.output.queue";
    public static final String EDM_CACHE_FILE_ROUTING_KEY = "edm.file.output.routing.key";
    public static final String EDM_CACHE_FILE_EXCHANGE = "edm.file.output.exchange";

    public static final String EDM_COMPANY_FILE_QUEUE = "edm.file.archive.queue";
    public static final String EDM_COMPANY_FILE_ROUTING_KEY = "edm.file.archive.routing.key";
    public static final String EDM_COMPANY_FILE_EXCHANGE = "edm.file.archive.exchange";

    /**
     * 设备上行状态推送队列
     */
    public static final String DEVICE_STATUS_EXCHANGE= "device.status.exchange";

    /**
     * 音响音量数据推送
     */
    public static final String DEVICE_SOUND_VOL_EXCHANGE= "device.sound.vol.exchange";

    /**
     * 单灯上行数据推送
     */
    public static final String DEVICE_LIGHT_STATUS_EXCHANGE = "device.light.data.exchange";

    /**
     * 显示屏文件下发进度队列
     */
    public static final String SCREEN_SEND_PERCENT_EXCHANGE = "screen.send.percent.exchange";

    /**
     * 显示屏清单列表刷新队列
     */
    public static final String SCREEN_CONFIG_EXCHANGE = "screen.config.exchange";
    public static final String SCREEN_CONFIG_ROUTING_KEY = "screen.config.routing.key";
    public static final String EDM_FILE_DOWNLOAD_QUEUE = "edm.file.download.queue";
    public static final String EDM_FILE_DOWNLOAD_ROUTING_KEY = "edm.file.download.routing.key";
    public static final String EDM_FILE_DOWNLOAD_EXCHANGE = "edm.file.download.exchange";

    /**
     * edm的socket推送
     */
    public static final String EDM_SOCKET_QUEUE = "direct.socket.edm.queue";

    /**
     * 支撑平台的socket推送
     */
    public static final String SUPPORT_SOCKET_QUEUE = "direct.socket.support.queue";
}
