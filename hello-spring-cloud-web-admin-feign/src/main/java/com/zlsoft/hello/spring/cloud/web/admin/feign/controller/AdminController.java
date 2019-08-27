package com.zlsoft.hello.spring.cloud.web.admin.feign.controller;

import com.zlsoft.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-27 09:19
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}
