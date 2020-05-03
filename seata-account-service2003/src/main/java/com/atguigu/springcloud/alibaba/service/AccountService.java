package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author allen
 * @date 2020-05-03 20:51
 */
public interface AccountService {
    //扣减余额
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}

