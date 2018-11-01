package com.crw.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class CenterConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterConfigServerApplication.class, args);
    }
}
