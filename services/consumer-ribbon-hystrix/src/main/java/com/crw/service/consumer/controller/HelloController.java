package com.crw.service.consumer.controller;

import com.crw.service.consumer.service.HelloService;
import com.crw.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/getUserInfo")
    public User getUserInfo(User user) throws InterruptedException {
        Thread.sleep(5000L);
        return helloService.getUserInfo(user);
    }


}
