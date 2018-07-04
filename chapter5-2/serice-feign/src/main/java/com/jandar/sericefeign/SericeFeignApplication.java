package com.jandar.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @EnableDiscoveryClient向服务注册中心注册
 * @EnableFeignClients开启Feign功能
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SericeFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SericeFeignApplication.class, args);
    }


}
