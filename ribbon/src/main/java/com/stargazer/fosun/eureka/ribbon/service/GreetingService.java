package com.stargazer.fosun.eureka.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {

    @Autowired
    private RestTemplate restTemplate;

    public String greeting(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
