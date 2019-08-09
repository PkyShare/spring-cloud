package com.pky.spring.cloud.web.admin.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient // 服务注册与发现客户端
@EnableHystrixDashboard  // 查看监控数据
public class AdminHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminHystrixDashboardApplication.class, args);
    }
}
