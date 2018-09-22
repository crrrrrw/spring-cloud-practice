package com.crw.service.consumer.service;

import com.crw.service.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultUserInfo")
    public User getUserInfo(User user) {
        // int i = 10 / 0;
        return restTemplate.getForEntity("http://USER-SERVICE/user/get?name={1}&age={2}&email={3}", User.class,
                user.getName(), user.getAge(), user.getEmail()).getBody();
    }

    public User defaultUserInfo(User user) {
        return new User("none", 0, "none");
    }


}
