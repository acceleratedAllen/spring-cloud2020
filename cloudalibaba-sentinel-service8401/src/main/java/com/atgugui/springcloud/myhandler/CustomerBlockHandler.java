package com.atgugui.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author allen
 * @date 2020-05-01 20:53
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException blockException){
        return new CommonResult(233,"按客户自定义称限流,全局1");

    }

    public static CommonResult handlerException2(BlockException blockException){
        return new CommonResult(233,"按客户自定义称限流,全局2");

    }

}
