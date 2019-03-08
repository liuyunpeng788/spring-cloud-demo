package com.stargazer.fosun.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //常用在配置了zookeeper集群的服务发现
@EnableFeignClients
@EnableHystrix //允许熔断功能
//@EnableEurekaClient //作用与EnableDiscoveryClient相同。常用在配置了Eureka集群的服务发现
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
