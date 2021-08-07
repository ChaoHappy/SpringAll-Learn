package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig8998Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig8998Application.class,args);
    }
}
