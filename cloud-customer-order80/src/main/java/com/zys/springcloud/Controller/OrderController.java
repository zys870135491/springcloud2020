package com.zys.springcloud.Controller;

import com.zys.springcloud.entities.CommonResult;
import com.zys.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    //public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

   /* @Value("${service-url.nacos-user-service}")
    private String nacos_user_service;*/

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/customer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment, CommonResult.class);
    }


    @GetMapping("/customer/payment/get/{id}")
    public CommonResult<Payment> orderId(@PathVariable("id")Long id){
        CommonResult forObject = restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        return forObject;
    }

}
