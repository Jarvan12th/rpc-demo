package com.example.rpcdemo.server.service.impl;

import com.example.rpcdemo.server.service.SayHelloWorldService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.rpcdemo.server.service.SayHelloWorldService")
public class SayHelloWorldServiceImpl implements SayHelloWorldService {

    @Override
    public String sayHelloWorldToName(String name) {
        return "Server side say, hello world " + name;
    }
}
