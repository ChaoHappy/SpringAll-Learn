package com.chp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${user.name}")
    private String userName;

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello config；"+userName;
    }
}
