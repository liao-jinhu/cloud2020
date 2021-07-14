package com.liao.springcloud.config;

import org.springframework.boot.actuate.autoconfigure.web.server.LocalManagementPort;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/07/11/21:57
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }


}
