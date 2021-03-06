package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWay9995Application {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9995Application.class,args);
    }
}
