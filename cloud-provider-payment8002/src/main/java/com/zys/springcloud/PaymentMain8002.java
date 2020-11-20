package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        System.out.println("----------------PaymentMain8002 start------------");
        SpringApplication.run(PaymentMain8002.class);
        System.out.println("----------------PaymentMain8002 end--------------");
    }

}
