package com.zys.springcloud.Controller;

import com.zys.springcloud.Service.PaymentFeignService;
import com.zys.springcloud.entities.CommonResult;
import com.zys.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/customer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/customer/payment/timeOut")
    public String timeOut(){
        return paymentFeignService.timeOut();
    }
}
