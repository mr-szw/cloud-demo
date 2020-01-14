package com.sinbad.cloud.demo.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class FilterZuulConfig extends ZuulFilter {

    private static final String PRE_TYPE = "pre";

    /**
     * 过滤类型 ： pre route post error
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 返回执行优先级，数字越小，优先级越高，越早执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 设置过滤条件
     */
    @Override
    public boolean shouldFilter() {
        return RequestContext.getCurrentContext().getRouteHost() != null
                && RequestContext.getCurrentContext().sendZuulResponse();
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
       //例如：做一些身份信息的拦截转化

        return null;
    }


//    @Bean
//    public PreDecorationFilter preDecorationFilter() {
//        return new PreDecorationFilter();
//    }
}
