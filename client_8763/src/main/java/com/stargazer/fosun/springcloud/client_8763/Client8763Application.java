package com.stargazer.fosun.springcloud.client_8763;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class Client8763Application {

    public static void main(String[] args) {
        SpringApplication.run(Client8763Application.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return "hello ,boy," + name + ",i am from port:" + port;
    }
}
