package com.hoolink.sdk.mq;

import com.hoolink.sdk.constants.AddressConstants;
import com.hoolink.sdk.constants.CommonConstants;
import com.hoolink.sdk.constants.Constants;
import com.hoolink.sdk.enums.PropertyCfg;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;


/**
 * MQ客户端工具类
 * @author zhouyun
 * @data 2018/8/7 11:44
 */
@Slf4j
public class MQClient {

    private static Connection conn;

    private static Connection getConnection() {
        if (conn == null || !conn.isOpen()) {
            synchronized (MQClient.class) {
                if (conn == null || !conn.isOpen()) {
                    try {
                        ConnectionFactory factory = new ConnectionFactory();
                        factory.setHost(AddressConstants.getProperty(PropertyCfg.RABBITMQ_HOST.getKey()));
                        conn = factory.newConnection();
                    } catch (Exception e) {
                        log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
                    }
                }
            }
        }
        return conn;
    }

    /**
     * 工作队列模式：一个生产者，多个消费者，每条消息只能被一个消费者消费，多个消费者只有一个队列
     * 传参说明 queue:MQ队列 msg:发送的内容 其中均为必填项
     *
     * @param queue
     * @param msg
     */
    public static void directSend(String queue, String msg) {
        if (StringUtils.isEmpty(queue)) {
            log.warn("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_QUEUE_NULL);
            return;
        }
        if (StringUtils.isEmpty(msg)) {
            log.warn( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_MESSAGE_NULL);
            return;
        }
        log.info( "{}:MQClient,{}:{},{}:{}", CommonConstants.LOG_METHOD, Constants.LOG_QUEUE, queue, Constants.LOG_MESSAGE, msg);

        Channel channel = null;
        try {
            //创建通道
            channel = getConnection().createChannel();
            //定义一个消息队列
            channel.queueDeclare(queue, true, false, false, null);
            //发布消息
            channel.basicPublish("", queue, null, msg.getBytes());
        } catch (Exception e) {
            log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
        } finally {
            try {
                if (channel != null) {
                    channel.close();
                }
            } catch (Exception e) {
                log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
            }
        }
    }

    /**
     * 路由模式：生产者发送消息到交换机并且要指定路由key，消费者将队列绑定到交换机时需要指定路由key
     * 传参说明 exchange:MQ交换机 key:路由key值 msg:发送的内容 其中均为必填项
     *
     * @param exchange
     * @param key
     * @param msg
     */
    public static void directSend(String exchange, String key, String msg) {
        if (StringUtils.isEmpty(exchange)) {
            log.warn("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_EXCHANGE_NULL);
            return;
        }
        if (StringUtils.isEmpty(key)) {
            log.warn("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_KEY_NULL);
            return;
        }
        if (StringUtils.isEmpty(msg)) {
            log.warn( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_MESSAGE_NULL);
            return;
        }
        log.info("{}:MQClient,{}:{},{}:{},{}:{}", CommonConstants.LOG_METHOD, Constants.LOG_EXCHANGE, exchange, Constants.LOG_KEY, key, Constants.LOG_MESSAGE, msg);

        Channel channel = null;
        try {
            //创建通道
            channel = getConnection().createChannel();
            //定义一个交换机
            channel.exchangeDeclare(exchange, "direct", true);
            //发布消息
            channel.basicPublish(exchange, key, null, msg.getBytes());
        } catch (Exception e) {
            log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
        } finally {
            try {
                if (channel != null) {
                    channel.close();
                }
            } catch (Exception e) {
                log.error("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
            }
        }
    }

    /**
     * 发布/订阅模式：一个生产者发送的消息会被多个消费者获取。一个生产者、一个交换机、多个队列、多个消费者
     * 传参说明 exchange:MQ交换机 msg:发送的内容 其中均为必填项
     *
     * @param exchange
     * @param msg
     */
    public static void fanoutSend(String exchange, String msg) {
        if (StringUtils.isEmpty(exchange)) {
            log.warn("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_EXCHANGE_NULL);
            return;
        }
        if (StringUtils.isEmpty(msg)) {
            log.warn("{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, Constants.LOG_MESSAGE_NULL);
            return;
        }
        log.info( "{}:MQClient,{}:{},{}:{}", CommonConstants.LOG_METHOD, Constants.LOG_EXCHANGE, exchange, Constants.LOG_MESSAGE, msg);

        Channel channel = null;
        try {
            //创建通道
            channel = getConnection().createChannel();
            //定义一个交换机
            channel.exchangeDeclare(exchange, "fanout", true);
            //发布消息
            channel.basicPublish(exchange, "", null, msg.getBytes());
        } catch (Exception e) {
            log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
        } finally {
            try {
                if (channel != null) {
                    channel.close();
                }
            } catch (Exception e) {
                log.error( "{}:MQClient,{}:{}", CommonConstants.LOG_METHOD, CommonConstants.LOG_CONTENT, e);
            }
        }
    }

}
