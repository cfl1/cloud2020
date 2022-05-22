package com.chen.springcloud.service;

import com.chen.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenfl
 * @create 2021-01-12-14:49
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
