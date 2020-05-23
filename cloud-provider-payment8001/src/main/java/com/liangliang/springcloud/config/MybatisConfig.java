package com.liangliang.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * created by Liangliang on 2020/5/22
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.liangliang.springcoud.dao")
public class MybatisConfig {
}
