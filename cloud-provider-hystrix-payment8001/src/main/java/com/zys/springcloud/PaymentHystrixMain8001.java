package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        System.out.println("----------------PaymentHystrixMain8001 start-----------------");
        SpringApplication.run(PaymentHystrixMain8001.class,args);
        System.out.println("----------------PaymentHystrixMain8001 end-----------------");
    }
}


