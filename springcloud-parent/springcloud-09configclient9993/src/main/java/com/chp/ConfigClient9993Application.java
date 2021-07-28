package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient9993Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9993Application.class,args);
    }
}
