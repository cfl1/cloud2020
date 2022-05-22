package com.chen.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chen.springcloud.entities.CommonResult;

/**
 * @author chenfl
 * @create 2021-01-19-19:13
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler-----1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler------2");
    }
}
