package com.hoolink.sdk.cloud.intercepter;

import com.alibaba.fastjson.JSON;
import com.hoolink.sdk.bo.base.CurrentUserBO;
import com.hoolink.sdk.utils.ContextUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author chenzhixiong
 * @date 2019/10/15 14:02
 */
@Slf4j
@Component
public class TransmitUserInfoFeighClientIntercepter implements RequestInterceptor {


    public TransmitUserInfoFeighClientIntercepter() {
    }



    @Override
    public void apply(RequestTemplate requestTemplate) {
        //从应用上下文中取出user信息，放入Feign的请求头中
        CurrentUserBO user = ContextUtil.getManageCurrentUser();
        String txId = ContextUtil.getTxid();
        log.info("Feign的请求头中 user :{},txId :{}",JSON.toJSONString(user),txId);
        if (user != null) {
            try {
                String userJson = JSON.toJSONString(user);
                requestTemplate.header("manageCurrentUser",new String[]{URLDecoder.decode(userJson,"UTF-8")});
                requestTemplate.header("txId",txId);
            } catch (UnsupportedEncodingException e) {
                log.error("用户信息设置错误",e);
            }
        }
    }
}
