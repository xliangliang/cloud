package com.liangliang.springcloud.service;

import com.liangliang.springcloud.entity.Payment;

/**
 * created by Liangliang on 2020/5/22
 */
public interface PaymentService {

    Payment create(Payment payment);

    Payment getPaymentById(Long paymentId);
}
