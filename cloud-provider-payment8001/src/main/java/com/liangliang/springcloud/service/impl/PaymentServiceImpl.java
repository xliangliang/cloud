package com.liangliang.springcloud.service.impl;

import com.liangliang.springcloud.dao.PaymentDao;
import com.liangliang.springcloud.entity.Payment;
import com.liangliang.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by Liangliang on 2020/5/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment create(Payment payment) {
        long paymentId = paymentDao.create(payment);
        payment.setId(paymentId);
        return payment;
    }

    @Override
    public Payment getPaymentById(Long paymentId) {
        return paymentDao.getPaymentById(paymentId);
    }
}