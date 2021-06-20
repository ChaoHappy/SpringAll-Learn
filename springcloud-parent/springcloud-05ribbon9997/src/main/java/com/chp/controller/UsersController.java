package com.chp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/findAll")
    public String listAll(){
        //获取服务列表
        List<ServiceInstance> products = discoveryClient.getInstances("productsclient9998");
        for (ServiceInstance s :products){
            System.out.println("服务主机:"+s.getHost());
            System.out.println("服务端口:"+s.getPort());
            System.out.println("服务地址:"+s.getUri());
        }
        String host = products.get(0).getHost();
        int port = products.get(0).getPort();
        String uri = products.get(0).getUri().toString();
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject(uri+"/product/findAll",String.class);
        return str;
    }

    @GetMapping("/user/findAll/loadBalancer")
    public String listAllLoadBalancer(){
        ServiceInstance products = loadBalancerClient.choose("productsclient9998");
        System.out.println("服务主机:"+products.getHost());
        System.out.println("服务端口:"+products.getPort());
        System.out.println("服务地址:"+products.getUri());
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject(products.getUri()+"/product/findAll",String.class);
        return str;
    }

    @GetMapping("/user/findAll/zhujie/loadBalanced")
    public String listAllZhujieLoadBalanced(){
        String str = restTemplate.getForObject("http://productsclient9998/product/findAll",String.class);
        return str;
    }
}
