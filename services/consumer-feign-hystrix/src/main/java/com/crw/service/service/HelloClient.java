package com.crw.service.service;

import com.crw.service.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service", fallback = HelloClientFallBack.class)
public interface HelloClient {

    @GetMapping("/user/get")
    User hello(@RequestParam("name") String name,
               @RequestParam("age") int age,
               @RequestParam("email") String email);

}
