package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        System.out.println("------------------OrderFeignMain80 start-------------------");
        SpringApplication.run(OrderFeignMain80.class,args);
        System.out.println("------------------OrderFeignMain80 end-------------------");
    }
}


