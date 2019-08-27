package com.zlsoft.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-27 09:14
 */
@SpringBootApplication
// 注册到服务中心
@EnableDiscoveryClient
// 开启fegin功能
@EnableFeignClients
// 熔断监视器
@EnableHystrixDashboard
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
