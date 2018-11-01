package com.crw.service.user.controller;

import com.crw.service.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/get")
    public User get(String name, int age, String email) {
        return new User(name, age, email);
    }

    /**
     * 一个超时的服务
     *
     * @param name
     * @return
     */
    @RequestMapping("/testRetry")
    public String testRetry(@RequestParam String name) {
        logger.info("name is " + name);
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            logger.error("testRetry error", e);
        }
        return "hello: " + name;
    }

    @Value("${crw.hello}")
    private String hello;

    @RequestMapping("/testConfig")
    public String testConfig() {
        return hello;
    }
}
