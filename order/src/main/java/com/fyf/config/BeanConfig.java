package com.fyf.config;

import com.fyf.service.BeanCreateService;
import com.fyf.service.JSR250BeanCreateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fyf")
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanCreateService beanCreateService() {
        return new BeanCreateService();
    }

    @Bean
    JSR250BeanCreateService jsr250BeanCreateService() {
        return new JSR250BeanCreateService();
    }
}
