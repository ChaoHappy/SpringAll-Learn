package com.chp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//value属性用来指定:调用服务名称
@FeignClient("productsclient9998")
public interface ProductClient {
    @GetMapping("/product/findAll") //书写服务调用路径
    String findAll();
}
