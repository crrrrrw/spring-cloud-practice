package com.crw.springcloud.gateway.conf;

import com.crw.springcloud.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayFilterConfig {
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
