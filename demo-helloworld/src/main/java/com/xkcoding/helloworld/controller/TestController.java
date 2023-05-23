package com.xkcoding.helloworld.controller;

import com.xkcoding.helloworld.event.RegisterSuccessEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private ApplicationContext applicationContext;

    @PostMapping("/publishEvent")
    public void publishEvent() {
        applicationContext.publishEvent(new RegisterSuccessEvent("歪歪"));
    }
}
