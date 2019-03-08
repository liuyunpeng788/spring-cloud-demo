package com.stargazer.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            requestContext.setResponseStatusCode(401);
            requestContext.setSendZuulResponse(false); //如果为true,则不会返回消息。而是直接抛出一个错误页面
            try {
                requestContext.getResponse().getWriter().write("token is empty");
            }catch (Exception ex){
                throw new ZuulException(ex.getCause(),401,"get requestContext failure");
            }
        }
        return requestContext;
    }
}
