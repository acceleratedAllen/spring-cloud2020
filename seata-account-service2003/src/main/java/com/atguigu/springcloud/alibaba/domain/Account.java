package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author allen
 * @date 2020-05-03 20:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;

    //用户id
    private long userId;

    //总额度
    private BigDecimal total;

    //已用额度
    private BigDecimal used;

    //剩余额度
    private BigDecimal residue;
}
