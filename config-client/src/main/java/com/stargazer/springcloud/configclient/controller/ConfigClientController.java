package com.stargazer.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${test:failure to get value}")
    private String strTest;

    @RequestMapping("/test")
    public String getValue(){
        System.out.println("aaa" + strTest);
        return strTest;
    }
    /**
     * 重新加载配置文件(只有想不到没有猜不到)
     * @Author    张志朋
     * @param request  void
     * @Date    2016年8月24日
     * 更新日志
     * 2016年8月24日 张志朋  首次创建
     *
     */
    @RequestMapping(value="refreshXmlWebApplicationContext2016}")
    public void refresh(HttpServletRequest request){
        XmlWebApplicationContext context =
                (XmlWebApplicationContext) WebApplicationContextUtils
                        .getWebApplicationContext(request.getServletContext());
        context.refresh();
    }
}
