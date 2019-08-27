package com.zlsoft.hello.spring.cloud.web.admin.feign.service;

import com.zlsoft.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-27 09:17
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @GetMapping(value = "hi")
    String sayHi(@RequestParam(value = "message") String message);
}
