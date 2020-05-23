package com.liangliang.springcloud.dao;

import com.liangliang.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * created by Liangliang on 2020/5/22
 */
@Mapper
public interface PaymentDao {
    long create(@Param("payment") Payment payment);

    Payment getPaymentById(@Param("paymentId") Long paymentId);
}
