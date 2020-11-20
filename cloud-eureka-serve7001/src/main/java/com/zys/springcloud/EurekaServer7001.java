package com.zys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001 {

    public static void main(String[] args) {
        System.out.println("---------------EurekaServer7001 start------------------");
        SpringApplication.run(EurekaServer7001.class,args);
        System.out.println("---------------EurekaServer7001 end------------------");
    }
}
