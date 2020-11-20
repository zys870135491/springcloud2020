package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002 {
    public static void main(String[] args) {
        System.out.println("---------------EurekaServer7002 start------------------");
        SpringApplication.run(EurekaServer7002.class,args);
        System.out.println("---------------EurekaServer7002 end------------------");
    }
}
