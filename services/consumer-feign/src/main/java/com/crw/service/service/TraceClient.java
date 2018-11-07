package com.crw.service.service;

import com.crw.service.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface TraceClient {

    @GetMapping("/trace-2")
    String trace();

}
