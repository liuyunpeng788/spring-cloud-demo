package com.stargazer.fosun.eureka.feign.controller;

import com.stargazer.fosun.eureka.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String say(@RequestParam String name){
        return feignService.sayHiFromClientOne(name);
    }
}
