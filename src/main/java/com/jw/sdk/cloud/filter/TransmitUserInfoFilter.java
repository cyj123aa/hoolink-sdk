package com.jw.sdk.cloud.filter;

import com.alibaba.fastjson.JSON;
import com.jw.sdk.bo.base.CurrentUserBO;
import com.jw.sdk.constants.ContextConstant;
import com.jw.sdk.utils.ContextUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;


/**
 * @author chenyuejun
 * @date 2019/10/15 13:05
 */
@Slf4j
@Component
public class TransmitUserInfoFilter implements Filter {

    public TransmitUserInfoFilter() {
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        this.initUserInfo((HttpServletRequest)request);
        chain.doFilter(request,response);
    }

    private void initUserInfo(HttpServletRequest request){
        String userJson = request.getHeader(ContextConstant.MANAGE_CURRENT_USER);
        String txId = request.getHeader(ContextConstant.TX_ID);
        log.info("TransmitUserInfoFilter的请求头中 user :{},txId :{}",userJson,txId);
        if (StringUtils.isNotBlank(userJson)) {
            try {
                userJson = URLDecoder.decode(userJson,"UTF-8");
                CurrentUserBO userInfo = (CurrentUserBO) JSON.parseObject(userJson,CurrentUserBO.class);
                //将UserInfo放入上下文中
                ContextUtil.setManageCurrentUser(userInfo);
                ContextUtil.setTxid(txId);
            } catch (UnsupportedEncodingException e) {
                log.error("init userInfo error",e);
            }
        }
    }

    @Override
    public void destroy() {
    }
}
