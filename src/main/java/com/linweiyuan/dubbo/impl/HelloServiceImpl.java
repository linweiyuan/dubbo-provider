package com.linweiyuan.dubbo.impl;

import com.linweiyuan.dubbo.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello " + name;
    }
}