package com.pky.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "admin")
public class AdminController {

    @Value("${server.port}")
    String port;

    @PostMapping(value = "")
    public String adminTest(){
        return String.format("hello, I'm service admin from port :%s",port);
    }
}
