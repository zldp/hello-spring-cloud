package com.zlsoft.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-26 10:53
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(String message){

        return String.format("Hi your message is : %s port ：%s", message, port);
    }
}
