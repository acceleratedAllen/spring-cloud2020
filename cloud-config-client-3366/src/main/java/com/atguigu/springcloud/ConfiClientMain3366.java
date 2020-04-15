package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author allen
 * @date 2020-04-12 22:54
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfiClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfiClientMain3366.class,args);
    }
}
