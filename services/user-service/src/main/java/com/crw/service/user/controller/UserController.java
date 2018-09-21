package com.crw.service.user.controller;

import com.crw.service.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public User get(String name, int age, String email) {
        return new User(name, age, email);
    }
}
