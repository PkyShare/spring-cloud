package com.pky.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "admin")
public class TestProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "")
    public String adminTest(){
        return String.format("hello, I'm service admin from port :%s",port);
    }
}
