package com.hoolink.sdk.cloud;

import com.hoolink.sdk.cloud.filter.TransmitUserInfoFilter;
import com.hoolink.sdk.cloud.intercepter.TransmitUserInfoFeighClientIntercepter;
import org.springframework.context.annotation.Bean;

/**
 * @author chenzhixiong
 * @date 2019/10/16 15:10
 */
public class EnableUserInfoTransmitterAutoConfiguration {

    public EnableUserInfoTransmitterAutoConfiguration() {
    }

    @Bean
    public TransmitUserInfoFeighClientIntercepter transmitUserInfo2FeighHttpHeader(){
        System.out.println("-----TransmitUserInfoFeighClientInterceptor");
        return new TransmitUserInfoFeighClientIntercepter();
    }

    @Bean
    public TransmitUserInfoFilter transmitUserInfoFromHttpHeader(){
        System.out.println("-----TransmitUserInfoFilter");
        return new TransmitUserInfoFilter();
    }
}