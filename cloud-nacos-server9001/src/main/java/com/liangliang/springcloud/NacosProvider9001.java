package com.liangliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created by Liangliang on 2020/5/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class, args);
    }
}
