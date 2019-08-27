package com.zlsoft.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    // 熔断注解  回调函数为 hiError
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }

    public String hiError(String message){
        return String.format("Hi,your message is %s ,but request error", message);
    }
}