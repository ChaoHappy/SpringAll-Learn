package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient8999Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosClient8999Application.class,args);
    }
}
