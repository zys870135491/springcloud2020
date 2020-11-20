package com.zys.springcloud.service;

import com.zys.springcloud.dao.PaymentMapper;
import com.zys.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceimpl implements PaymentService{

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
