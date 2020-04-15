package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author allen
 * @date 2020-04-03 23:55
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenfeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenfeignMain80.class,args);
    }

}
