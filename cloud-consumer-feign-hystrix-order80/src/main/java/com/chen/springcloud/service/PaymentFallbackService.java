package com.chen.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author chenfl
 * @create 2021-01-14-14:34
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----------------PaymentFallbackService fall back paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----------------PaymentFallbackService fall back paymentInfo_TimeOut";

    }
}
