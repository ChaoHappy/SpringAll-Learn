package com.chp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${server.port}")
    private  String cusName;

    @GetMapping(value = "/config")
    public String getConfig(){
        System.out.println(cusName);
        return cusName;
    }
}
