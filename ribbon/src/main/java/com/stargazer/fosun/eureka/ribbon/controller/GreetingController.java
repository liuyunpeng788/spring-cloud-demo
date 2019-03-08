package com.stargazer.fosun.eureka.ribbon.controller;

import com.stargazer.fosun.eureka.ribbon.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;
    @RequestMapping("/hi")
    public String greeting(@RequestParam String name){
        return greetingService.greeting(name);
    }
}
