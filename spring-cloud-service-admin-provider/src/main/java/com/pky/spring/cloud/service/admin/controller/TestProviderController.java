package com.pky.spring.cloud.service.admin.controller;

import com.pky.spring.cloud.service.admin.domain.User;
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

    /**
     * 获取用户信息
     * @param user
     * @return
     */
    @PostMapping(value = "user")
    public User getUser(User user) {
        user.setPassword("123");
        user.setUsername("pky");
        return user;
    }
}
