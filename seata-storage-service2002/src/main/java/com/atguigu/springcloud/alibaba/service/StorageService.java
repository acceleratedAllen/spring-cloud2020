package com.atguigu.springcloud.alibaba.service;

/**
 * @author allen
 * @date 2020-05-03 17:39
 */
public interface StorageService {
    //扣减库存
    void decrease(Long productId,Integer count);
}
