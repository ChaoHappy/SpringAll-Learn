package com.chp.controller;

import com.chp.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/user/findAll")
    public String listAll(){
        String str = productClient.findAll();
        return str;
    }
}
