package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author allen
 * @date 2020-05-03 17:40
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    //扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------------StorageService扣减库存 start");
        storageDao.decrease(productId,count);
        LOGGER.info("------------StorageService扣减库存 end");
    }
}
