package com.pky.spring.cloud.web.admin.feign.config;

import feign.Logger;
import feign.Request;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    /**
     * 日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * Basic 认证配置
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("pky", "123");
    }

    /**
     * 超时配置
     * @return
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }
}
