package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentOpenfeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author allen
 * @date 2020-04-05 22:29
 */
@RestController
@Slf4j
public class OrderOpenfeignController {

    @Resource
    private PaymentOpenfeignService paymentOpenfeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentOpenfeignService.getPaymentById(id);
    }

    @GetMapping(value = "/comsumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon 客户端一般默认等待1秒钟
        return paymentOpenfeignService.paymentFeignTimeout();
    }

}
