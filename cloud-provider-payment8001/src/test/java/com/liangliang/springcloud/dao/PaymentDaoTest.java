package com.liangliang.springcloud.dao;


import com.liangliang.springcloud.entity.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * created by Liangliang on 2020/5/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentDaoTest {

    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void create() {
        Payment payment = new Payment();
        payment.setSerial("2");
        long result = paymentDao.create(payment);
        System.out.println(result);
    }

    @Test
    public void getPaymentById() {
    }
}