package com.liangliang.springcloud.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * created by Liangliang on 2020/5/22
 */
@Setter
@Getter
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
