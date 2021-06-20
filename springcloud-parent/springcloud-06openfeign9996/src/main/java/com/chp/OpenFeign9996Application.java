package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeign9996Application {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeign9996Application.class,args);
    }
}
