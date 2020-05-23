package com.liangliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created by Liangliang on 2020/5/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class, args);
    }
}
