package com.pky.spring.cloud.zuul.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot 2.x 版本开启 Hystrix Dashboard 与 Spring Boot 1.x 的方式略有不同，
 * 需要增加一个 HystrixMetricsStreamServlet 的配置
 */
@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        // 因为没有web.xml，springboot-web-servlet 提供的创建 servlet 的方式。
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        // 注册 servlet
        registrationBean.setLoadOnStartup(1);   // servlet 启动顺序
        registrationBean.addUrlMappings("/hystrix.stream");  // servlet 的 mapping
        registrationBean.setName("HystrixMetricsStreamServlet");  // servlet 的 name
        return registrationBean;
    }
}
