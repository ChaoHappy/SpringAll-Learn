package com.chp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsersController {

    @GetMapping("/user/findAll")
    public String listAll(){
        RestTemplate restTemplate = new RestTemplate();
       String str = restTemplate.getForObject("http://localhost:9998/product/findAll",String.class);
       return str;
    }
}
