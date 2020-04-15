package com.atgugui.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author allen
 * @date 2020-04-07 20:25
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------------------PaymentFallbackService-----paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------------------PaymentFallbackService-----paymentInfo_TimeOut";
    }
}
