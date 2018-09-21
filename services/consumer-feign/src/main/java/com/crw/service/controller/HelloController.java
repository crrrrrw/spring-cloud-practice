package com.crw.service.controller;

import com.crw.service.model.User;
import com.crw.service.service.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloClient helloClient;

    @GetMapping("/getUserInfo")
    public User getUserInfo(User user) {
        return helloClient.hello(user.getName(), user.getAge(), user.getEmail());
    }
}
