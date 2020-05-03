package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author allen
 * @date 2020-05-03 20:45
 */
@Mapper
public interface AccountDao {
    //扣减账户余额
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
