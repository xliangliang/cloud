package com.liangliang.springcloud.service.impl;

import com.liangliang.springcloud.entity.Payment;
import com.liangliang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * created by Liangliang on 2020/5/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    /*@Autowired
    private PaymentDao paymentDao;*/

    @Override
    public Payment create(Payment payment) {
        /*long paymentId = paymentDao.create(payment);*/
        payment.setId(1L);
        return payment;
    }

    @Override
    public Payment getPaymentById(Long paymentId) {
        /* return paymentDao.getPaymentById(paymentId);*/
        Payment payment = new Payment();
        payment.setId(5L);
        payment.setSerial("8002");
        return payment;
    }
}
