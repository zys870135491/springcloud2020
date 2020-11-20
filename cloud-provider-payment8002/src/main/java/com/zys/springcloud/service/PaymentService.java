package com.zys.springcloud.service;


import com.zys.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
