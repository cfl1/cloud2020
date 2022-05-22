package com.chen.springcloud.controller;

import com.chen.springcloud.domain.CommonResult;
import com.chen.springcloud.domain.Order;
import com.chen.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenfl
 * @create 2021-01-20-10:37
 */
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
