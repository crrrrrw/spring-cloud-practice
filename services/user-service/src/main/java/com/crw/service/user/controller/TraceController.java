package com.crw.service.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class TraceController {

    @GetMapping("/trace-2")
    public String trace(HttpServletRequest request) {
        log.info(">>> <call trace-2, TraceId={}, SpanId={}>, ParentSpanId={}, Sampled={}, Span-Name={} <<<",
                request.getHeader("X-B3-TraceId"),
                request.getHeader("X-B3-SpanId"),
                request.getHeader("X-B3-ParentSpanId"),
                request.getHeader("X-B3-Sampled"),
                request.getHeader("X-Span-Name"));
        return "Trace-2";
    }
}
