package com.pky.spring.cloud.web.admin.feign.service.hystrix;

import com.pky.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String testFeign() {
        return "网络错误，请稍后再试！";
    }

    @Override
    public String testFeignPost() {
        return "网络错误，请稍后再试！";
    }
}
