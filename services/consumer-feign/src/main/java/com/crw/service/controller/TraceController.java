package com.crw.service.controller;

import com.crw.service.service.TraceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TraceController {

    @Autowired
    private TraceClient traceClient;

    @GetMapping("/trace-1")
    public String trace() {
        log.info(">>> call trace-1 <<<");
        return traceClient.trace();
    }
}
