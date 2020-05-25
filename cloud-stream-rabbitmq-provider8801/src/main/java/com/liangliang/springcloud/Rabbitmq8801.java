package com.liangliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created by Liangliang on 2020/5/25
 */
@SpringBootApplication
@EnableEurekaClient
public class Rabbitmq8801 {
    public static void main(String[] args) {
        SpringApplication.run(Rabbitmq8801.class, args);
    }
}
