package com.liangliang.springcloud.service.impl;

import com.liangliang.springcloud.service.MyMessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * created by Liangliang on 2020/5/25
 */
@EnableBinding(Source.class)
public class MessageServiceImpl implements MyMessageProviderService {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        return uuid;
    }
}
