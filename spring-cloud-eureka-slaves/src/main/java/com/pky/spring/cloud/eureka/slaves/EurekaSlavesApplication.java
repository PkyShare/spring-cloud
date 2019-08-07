package com.pky.spring.cloud.eureka.slaves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启服务注册与发现
public class EurekaSlavesApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSlavesApplication.class, args);
    }
}
