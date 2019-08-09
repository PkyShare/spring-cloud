package com.pky.spring.cloud.web.admin.feign.controller;

import com.pky.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "feign")
public class AdminFeignController {

    @Autowired
    AdminService adminService;

    @GetMapping(value = "")
    public String testFeign(){
        return adminService.testFeign();
    }

    @GetMapping(value = "test_post")
    public String testFeignPost(){
        return adminService.testFeignPost();
    }
}
