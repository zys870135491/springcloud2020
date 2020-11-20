package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        System.out.println("---------------OrderHystrixMain80 start---------------");
        SpringApplication.run(OrderHystrixMain80.class,args);
        System.out.println("---------------OrderHystrixMain80 end---------------");
    }
}