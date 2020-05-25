package com.liangliang.springcloud.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * created by Liangliang on 2020/5/25
 */
@Component
@EnableBinding(Sink.class)
public class MsgConsumerController {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("MsgConsumerController ---> " + message.getPayload());
    }
}
