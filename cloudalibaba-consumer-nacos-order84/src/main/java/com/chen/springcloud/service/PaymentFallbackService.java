package com.chen.springcloud.service;

import com.chen.springcloud.entities.CommonResult;
import com.chen.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author chenfl
 * @create 2021-01-19-20:06
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
