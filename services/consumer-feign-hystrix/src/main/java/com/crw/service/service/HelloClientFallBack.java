package com.crw.service.service;

import com.crw.service.model.User;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallBack implements HelloClient {
    @Override
    public User hello(String name, int age, String email) {
        return new User("none", 0, "none");
    }
}
