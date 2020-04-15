package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author allen
 * @date 2020-04-05 23:16
 */
@Configuration
public class OpenfeignConfig {
    @Bean
    Logger.Level feignLoggerlevel(){
        return Logger.Level.FULL;
    }
}
