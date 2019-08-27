package com.zlsoft.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dp
 * @version 1.0.0
 * @date 2019-08-27 10:01
 */
@Configuration
public class HystrixDashboardConfiguration {
    /**
     * 配置servlet springboot的配置方式
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1); // 启动顺序
        registrationBean.addUrlMappings("/hystrix.stream"); // 访问路径
        registrationBean.setName("HystrixMetricsStreamServlet"); // servlet名字
        return registrationBean;
    }
}
