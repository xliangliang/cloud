package com.liangliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created by Liangliang on 2020/5/25
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitConsumer8802 {

    public static void main(String[] args) {
        SpringApplication.run(RabbitConsumer8802.class, args);
    }
}
