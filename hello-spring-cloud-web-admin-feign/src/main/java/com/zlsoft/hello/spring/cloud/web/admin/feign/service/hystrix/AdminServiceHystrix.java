package com.zlsoft.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.zlsoft.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-27 09:43
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi,your message is %s ,but request error", message);
    }
}
