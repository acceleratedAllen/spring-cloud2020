package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author allen
 * @date 2020-05-03 11:35
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;


    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------------新建订单 start");
        //1 新建订单
        orderDao.create(order);

        //2 扣减库存
        log.info("------------订单微服务调用库存，做扣减count start");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------------订单微服务调用库存，做扣减count end ");

        //3 扣减账户
        log.info("------------订单微服务调用用户，做扣减money start");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------------订单微服务调用用户，做扣减money end");

        //4 修改订单状态 从0到1
        log.info("------------修改订单状态 start");
        orderDao.update(order.getUserId(),0);
        log.info("------------修改订单状态 end");

        log.info("------------新建订单 end");


    }
}
