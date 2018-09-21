package com.crw.service.consumer.controller;

import com.crw.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getUserInfo")
    public User getUserInfo(User user) {
        return restTemplate.getForEntity("http://USER-SERVICE/user/get?name={1}&age={2}&email={3}", User.class,
                user.getName(), user.getAge(), user.getEmail()).getBody();
    }
}
