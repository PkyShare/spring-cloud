package com.pky.spring.cloud.service.admin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminConsumerApplication.class);
    }
}
