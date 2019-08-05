package com.pky.spring.cloud.service.admin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "admin_consumer")
public class ServiceAdminConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "")
    public String testAdminConsumer() {
        return restTemplate.getForObject("http://localhost:9502/admin", String.class);
    }
}
