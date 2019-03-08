package com.stargazer.fosun.eureka.feign.service;

import org.springframework.stereotype.Component;

@Component
public class FallBackFeignServiceImpl implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
