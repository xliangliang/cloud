package com.liangliang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Liangliang on 2020/5/24
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRule() {
        // 随机
        return new RandomRule();
    }
}
