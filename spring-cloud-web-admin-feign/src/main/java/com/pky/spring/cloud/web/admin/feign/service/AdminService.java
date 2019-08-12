package com.pky.spring.cloud.web.admin.feign.service;

import com.pky.spring.cloud.web.admin.feign.config.FeignConfiguration;
import com.pky.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "admin-provider", path = "admin", configuration = FeignConfiguration.class, fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "")
    public String testFeign();

    @PostMapping(value = "user")
    public String testFeignPost();
}
